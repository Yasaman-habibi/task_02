package ir.freeland.springboot;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(value = "/api")
public class controller {

    public controller() {
        super();
    }


    @RequestMapping(value = "/books")
    @ResponseBody
    public String getBooksBySimplePath() {
        return "Simple Get some books";
    }



    @RequestMapping(value = "/books/{id}")
    @ResponseBody
    public String getBooksBySimplePathWithPathVariable(@PathVariable final long id) {
        return "Get a specific books with id=" + id;
    }

    


    @RequestMapping(value = "/books/{id}", method = RequestMethod.DELETE)
    @ResponseBody
    public String deleteBooks(@PathVariable final long id) {
        return "delete some books";
    }
    
    
    @RequestMapping(value = "/books/{id}", method = RequestMethod.PUT)
    @ResponseBody
    public String putBooks(@PathVariable final long id) {
        return "put some books";
    }

    
    @RequestMapping(value = "/books/create", method = RequestMethod.POST)
    @ResponseBody
    public String postBooks() {
        return "post some books";
    }

    
    @RequestMapping(value = "/books/title/{title}")
    @ResponseBody
    public String getBooksByTitle(@PathVariable final String title) {
        return "Get a specific books with title=" + title;
    }
}




   