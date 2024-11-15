package org.example.Day7.instanceVariable;

public class ClassRoom {
    private String RoomNo;
    private String RoomName;
    private int numberOfSeats;
    private static String BuildingName;
    private String floorNumber;
    private static String organizationName;
    private String facultyName;
    public ClassRoom(String RoomNo, String RoomName, int numberOfSeats, String BuildingName, String floorNumber, String organizationName, String facultyName) {
        System.out.println("Constructing time for Room " + RoomName);
        this.RoomNo = RoomNo;
        this.RoomName = RoomName;
        this.numberOfSeats = numberOfSeats;
        ClassRoom.BuildingName = BuildingName;
        this.floorNumber = floorNumber;
        ClassRoom.organizationName = organizationName;
        this.facultyName = facultyName;
    }
    public ClassRoom(){
        System.out.println("No Argument Constructor called");
    }
    public ClassRoom(String RoomNo, String RoomName, int numberOfSeats, String floorNumber, String facultyName) {
        System.out.println("Constructing time for Room " + RoomName);
        this.RoomNo = RoomNo;
        this.RoomName = RoomName;
        this.numberOfSeats = numberOfSeats;
        ClassRoom.BuildingName = BuildingName;
        this.floorNumber = floorNumber;
        ClassRoom.organizationName = organizationName;
        this.facultyName = facultyName;
    }
    public String getRoomNo() {
        return RoomNo;
    }

    public void setRoomNo(String roomNo) {
        RoomNo = roomNo;
    }

    public String getRoomName() {
        return RoomName;
    }

    public void setRoomName(String roomName) {
        RoomName = roomName;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public void setNumberOfSeats(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }

    public static String getBuildingName() {
        return BuildingName;
    }

    public static void setBuildingName(String buildingName) {
        BuildingName = buildingName;
    }

    public String getFloorNumber() {
        return floorNumber;
    }

    public void setFloorNumber(String floorNumber) {
        this.floorNumber = floorNumber;
    }

    public static String getOrganizationName() {
        return organizationName;
    }

    public static void setOrganizationName(String organizationName) {
        ClassRoom.organizationName = organizationName;
    }

    public String getFacultyName() {
        return facultyName;
    }

    public void setFacultyName(String facultyName) {
        this.facultyName = facultyName;
    }
    @Override
    public String toString() {
        return "ClassRoom{" +
                "RoomNo='" + RoomNo + '\'' +
                ", RoomName='" + RoomName + '\'' +
                ", numberOfSeats=" + numberOfSeats +
                ", floorNumber='" + floorNumber + '\'' +
                ", facultyName='" + facultyName + '\'' +
                ", BuildingName='" + BuildingName + '\'' +
                ", organizationName='" + organizationName + '\'' +
                '}';
    }


}
