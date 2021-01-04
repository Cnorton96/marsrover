package com.rover.marsrover;

public class HomeDto {

    private String marsApiRoverData;
    private Integer marsSol;
    private boolean cameraFhaz;
    private boolean cameraRhaz;
    private boolean cameraMast;
    private boolean cameraChemcam;
    private boolean cameraMahli;
    private boolean cameraMardi;
    private boolean cameraNavCam;
    private boolean cameraPancam;
    private boolean cameraMinites;

    public boolean getCameraFhaz() {
        return cameraFhaz;
    }

    public void setCameraFhaz(boolean cameraFhaz) {
        this.cameraFhaz = cameraFhaz;
    }

    public boolean getCameraRhaz() {
        return cameraRhaz;
    }

    public void setCameraRhaz(boolean cameraRhaz) {
        this.cameraRhaz = cameraRhaz;
    }

    public boolean getCameraMast() {
        return cameraMast;
    }

    public void setCameraMast(boolean cameraMast) {
        this.cameraMast = cameraMast;
    }

    public boolean getCameraChemcam() {
        return cameraChemcam;
    }

    public void setCameraChemcam(boolean cameraChemcam) {
        this.cameraChemcam = cameraChemcam;
    }

    public boolean getCameraMahli() {
        return cameraMahli;
    }

    public void setCameraMahli(boolean cameraMahli) {
        this.cameraMahli = cameraMahli;
    }

    public boolean getCameraMardi() {
        return cameraMardi;
    }

    public void setCameraMardi(boolean cameraMardi) {
        this.cameraMardi = cameraMardi;
    }

    public boolean getCameraNavCam() {
        return cameraNavCam;
    }

    public void setCameraNavCam(boolean cameraNavCam) {
        this.cameraNavCam = cameraNavCam;
    }

    public boolean getCameraPancam() {
        return cameraPancam;
    }

    public void setCameraPancam(boolean cameraPancam) {
        this.cameraPancam = cameraPancam;
    }

    public boolean getCameraMinites() {
        return cameraMinites;
    }

    public void setCameraMinites(boolean cameraMinites) {
        this.cameraMinites = cameraMinites;
    }

    public String getMarsApiRoverData() {
        return marsApiRoverData;
    }

    public void setMarsApiRoverData(String marsApiRoverData) {
        this.marsApiRoverData = marsApiRoverData;
    }

    public Integer getMarsSol() {
        return marsSol;
    }

    public void setMarsSol(Integer marsSol) {
        this.marsSol = marsSol;
    }


    @Override
    public String toString() {
        return "HomeDto{" +
                "marsApiRoverData='" + marsApiRoverData + '\'' +
                ", marsSol=" + marsSol +
                ", cameraFhaz=" + cameraFhaz +
                ", cameraRhaz=" + cameraRhaz +
                ", cameraMast=" + cameraMast +
                ", cameraChemcam=" + cameraChemcam +
                ", cameraMahli=" + cameraMahli +
                ", cameraMardi=" + cameraMardi +
                ", cameraNavCam=" + cameraNavCam +
                ", cameraPancam=" + cameraPancam +
                ", cameraMinites=" + cameraMinites +
                '}';
    }
}
