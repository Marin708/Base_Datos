package Ejercicio01;

public class coche {
    String marca = "";
    String modelo = "";
    String color = "";
    int año;
    boolean motor_encendido;
    float nivel_combustible=10;

    public void auto(boolean motor_encendido, String marca, String modelo, String color, int año, float nivel_combustible){
        this.marca = marca;
        this.año = año;
        this.motor_encendido = motor_encendido;
        this.color = color;
        this.modelo = modelo;
        this.nivel_combustible = 10;

    }
    public void caracteristicas_coche(){
        System.out.println("El modelo del carro: " + this.modelo + "\n" +
                "El año del carro es:" + this.año + "\n" +
                "El color del carro es:" + this.color + "\n" +
                "El vehiculo es de marca:" + this.marca + "\n");

    }
    public void encender(double kilometros){
        System.out.println("motor esta encendido");

    }
    public void apagar(){
        System.out.println("El motor esta apagado");
    }
    public void acelerar(){
            nivel_combustible-=0.1;
            if (nivel_combustible >1){
                System.out.println("nivel de combustible optimo, el coche esta acelerando");
                System.out.println("nivel de combustible es: " + nivel_combustible + " galones");
            }else {
                System.out.println("nivel de combustible no es optimo, desacelere el coche");
            }
    }
    public void recargar(double cantidad){
        nivel_combustible+=cantidad;
        if (cantidad >10){
            System.out.println("no puede exceder la cantidad");
        }else {
            System.out.println("recargo correctamente: "+ cantidad + " galones");
        }

    }
    public void obtener_nivel_combustible(){
        System.out.println("su nivel de combustible es : " + nivel_combustible);
    }

    public static void main(String[] args) {
        coche carro=new coche();
        carro.acelerar();
        carro.acelerar();
        carro.acelerar();
        carro.acelerar();
        carro.acelerar();
        carro.acelerar();
        carro.acelerar();
        carro.recargar(0.1);
        carro.recargar(0.1);
        carro.recargar(0.1);
        carro.obtener_nivel_combustible();


    }
}
