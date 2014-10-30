package week6

object forTranslate {

  case class Book(title: String, authors: List[String])

  val bookDB = Set(
    Book(title = "title 1", authors = List("Bird Man", "Other Man")),
    Book(title = "title 2", authors = List("Bat Man", "Other Man")),
    Book(title = "title 3", authors = List("Other Man")),
    Book(title = "title 4", authors = List("Bat Man", "Bird Man")),
    Book(title = "title 5", authors = List("Birdy Man", "Bird Man")))
                                                  //> bookDB  : scala.collection.immutable.Set[week6.forTranslate.Book] = Set(Book
                                                  //| (title 2,List(Bat Man, Other Man)), Book(title 1,List(Bird Man, Other Man)),
                                                  //|  Book(title 5,List(Birdy Man, Bird Man)), Book(title 4,List(Bat Man, Bird Ma
                                                  //| n)), Book(title 3,List(Other Man)))
  //Set(Book("title 1", ["Bird Man", "Other Man"]),
  //	Book(title = "title 1", authors = ["Bird Man", "Other Man"]))

  def birdSearch(books: Iterable[Book]): Iterable[String] =
    for {
      b <- books
      a <- b.authors
      if a startsWith "Bird"
    } yield b.title                               //> birdSearch: (books: Iterable[week6.forTranslate.Book])Iterable[String]

  def birdSearch2(books: Iterable[Book]): Iterable[String] =
    books.flatMap(b =>
      b.authors.withFilter(a =>
        a startsWith "Bird").map(a => b.title))   //> birdSearch2: (books: Iterable[week6.forTranslate.Book])Iterable[String]

  birdSearch(bookDB)                              //> res0: Iterable[String] = Set(title 1, title 5, title 4)
  birdSearch2(bookDB)                             //> res1: Iterable[String] = Set(title 1, title 5, title 4)
}