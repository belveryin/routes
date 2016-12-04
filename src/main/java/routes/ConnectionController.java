package routes;

import java.util.List;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConnectionController {

    @RequestMapping("/direct")
    public AreStationsConnected direct(
            @RequestParam(value="dep_sid") int dep_sid,
            @RequestParam(value="arr_sid") int arr_sid
    ) {
        Routes routes = Routes.getInstance();
        final boolean areConnected = routes.areStationsConnected(dep_sid, arr_sid);
        return new AreStationsConnected(dep_sid, arr_sid, areConnected);
    }
}
