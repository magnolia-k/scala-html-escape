import org.specs2.mutable.Specification

import html._

class HtmlEscapeSpec extends org.specs2.mutable.Specification {
  "basic test" >> {
    HtmlEscape.escape("<^o^>") === "&lt;^o^&gt;"
    HtmlEscape.escape("'") === "&#39;"
  
  }
}
