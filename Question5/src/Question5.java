public class Camera {
    private Camera(){}
    public String getCameraName() {
        return cameraName;
    }
    public void setCameraName(String cameraName) {
        this.cameraName = cameraName;
    }
    private static  Camera instance;
    private static Object obj = new Object();
    public static Camera getInstance(){

        if(instance == null){
            synchronized (obj){
                if(instance == null){
                    instance = new Camera();
                }
            }
        }

        return instance;
    }
}