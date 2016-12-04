package routes;

import java.lang.Integer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

class Routes {
    private static Routes INSTANCE = null;
    private List<Set<Integer>> routes = new ArrayList<>();

    private static Routes of(List<String> lines) {
        Routes routes = new Routes();
        int size = Integer.parseInt(lines.get(0));
        if (size > 0) {
            for (int i = 1; i < size; i++) {
                routes.addRoute(lines.get(i));
            }
        }

        return routes;
    }

    public static Routes getInstance(String fileName) {
        if(INSTANCE == null) {
            List<String> lines = ReadFile.getLines(fileName);
            INSTANCE = Routes.of(lines);
        }
        return INSTANCE;
    }

    public static Routes getInstance() {
        return Routes.getInstance("routes");
    }


    private void addRoute(String sRoute) {
        Set<Integer> route = new HashSet<>();
        String[] routeParts = sRoute.split(" ");

        for (int i = 1; i < routeParts.length; i++) {
            String station = routeParts[i];
            route.add(Integer.parseInt(station));
        }

        // Arrays.asList(sRoute.split(" ")).forEach((station) -> route.add(Integer.parseInt(station)));

        routes.add(route);
    }

    public boolean areStationsConnected(int station1, int station2) {
        boolean result = false;
        for (int i = 0; i < this.routes.size(); i++) {
            Set<Integer> route = this.routes.get(i);
            if (route.contains(station1) && route.contains(station2)) {
                return true;
            }
        }

        return result;
    }
}
