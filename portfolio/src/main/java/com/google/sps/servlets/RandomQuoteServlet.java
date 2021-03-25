package com.google.sps.servlets;

import java.io.IOException;
import com.google.gson.Gson;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/** Handles requests sent to the /favQuotes URL. **/
@WebServlet("/favQuotes")
public class RandomQuoteServlet extends HttpServlet {
    /**
     *
     */
    private static final long serialVersionUID = 1L;
    private String[] SomeFavQuotes = new String[]
    {
    "Genius is one percent inspiration and ninety-nine percent perspiration - Thomas Edison",
    "You can observe a lot just by watching - Yogi Berra", 
    "A house divided against itself cannot stand - Abraham Lincoln",
    "Difficulties increase the nearer we get to the goal - Johann Wolfgang von Goethe",
    "Fate is in your hands and no one elses - Byron Pulsifer",
    "Be the chief but never the lord. - Lao Tzu",
    "Nothing happens unless first we dream.- Carl Sandburg", 
    "Well begun is half done. - Aristotle",
    "Life is a learning experience, only if you learn. - Yogi Berra",
    "Self-complacency is fatal to progress.- Margaret Sangster",
    "Peace comes from within. Do not seek it without- Buddha"
};  

  @Override
  public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException { 
    // Convert the server stats to JSON
    String json = convertToJsonGson(SomeFavQuotes);

    // Send the JSON as the response
    response.setContentType("application/json;");
    response.getWriter().println(json);
   
  }

  /**
   * Converts a ServerStats instance into a JSON string using the Gson library. Note: We first added
   * the Gson library dependency to pom.xml.
   */
  private String convertToJsonGson(String[] favQuotes) {
    Gson gson = new Gson();
    String json = gson.toJson(favQuotes);
    return json;
  }
}
