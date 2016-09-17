package html

object HtmlEscape {
  def escape(html: String): String = {
    val builder = new StringBuilder
  
    for (c <- html) {
      c match {
        case '&'  => builder.append("&amp;")
        case '"'  => builder.append("&quot;")
        case '<'  => builder.append("&lt;")
        case '>'  => builder.append("&gt;")
        case '\'' => builder.append("&#39;")
        case '`'  => builder.append("&#96;")
        case '{'  => builder.append("&#123;")
        case '}'  => builder.append("&#125;")
        case _    => builder.append(c)
      }
    }

    builder.toString
  }
}
