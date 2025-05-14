public class Problema1_TestProducto {
    public static void main(String[] args) {
        Producto producto1 = new Producto(100, 10); 
        producto1.calcularDescuento(producto1.precioP, producto1.cantidadP);
        producto1.calcularPrecioFinal();
        System.out.println(producto1);
    }
}

class Producto{
    public double precioP;
    public int    cantidadP;
    public double descuento;
    public double precioFinal;
    public double montoD;

    public Producto() {
    }

    public Producto(double precioP, int cantidadP) {
        this.precioP = precioP;
        this.cantidadP = cantidadP;
    }
    public double calcularDescuento(double precioP, int cantidadP){
        this.descuento = (this.precioP >= 1000 && this.cantidadP >= 10) ? (10) : (5) ;
        this.montoD = (this.cantidadP * this.precioP) * (this.descuento / 100); 
        return this.montoD;
    }
    public double calcularPrecioFinal(){
        this.precioFinal = (this.cantidadP * this.precioP) - this.montoD;
        return this.precioFinal;
    }
        
    @Override
    public String toString() {
        return "Producto\n{precioP = " + precioP + ", cantidadP = " + cantidadP + ", descuento=" + descuento + ", precioFinal = " + precioFinal + ", montoD = " + montoD + '}';
    }
    
}