
package boletin18;


public class Correo {
    
    private String contenidomensaje;
    private Boolean correoleido;

    public Correo() {
    }

    public Correo(String contenidomensaje, Boolean correoleido) {
        this.contenidomensaje = contenidomensaje;
        this.correoleido = correoleido;
    }

    public String getContenidomensaje() {
        return contenidomensaje;
    }

    public void setContenidomensaje(String contenidomensaje) {
        this.contenidomensaje = contenidomensaje;
    }

    public Boolean getCorreoleido() {
        return correoleido;
    }

    public void setCorreoleido(Boolean correoleido) {
        this.correoleido = correoleido;
    }
    public void verificacorreoleido(){
        if(correoleido == true){
            System.out.println("Tienes mails sin leer");
        }
    }
   
    @Override
    public String toString() {
        return "Correo{" + "contenidomensaje=" + contenidomensaje + ", correoleido=" + correoleido + '}';
    }
    
    
}
