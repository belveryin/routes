package routes;

public class AreStationsConnected {

    private final int dep_sid;
    private final int arr_sid;
    private final boolean direct_bus_route;

    public AreStationsConnected(int dep_sid, int arr_sid, boolean direct_bus_route) {
        this.dep_sid = dep_sid;
        this.arr_sid = arr_sid;
        this.direct_bus_route = direct_bus_route;
    }

    public int getDep_sid() {
        return this.dep_sid;
    }

    public int getArr_sid() {
        return this.arr_sid;
    }

    public boolean getDirect_bus_route() {
        return this.direct_bus_route;
    }
}
