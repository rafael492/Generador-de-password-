
public class GeneradorDePassword {

    public static void main(String[] args) {
    
        System.out.println(generaPass());
    }
    static String generaPass(){
        char [] mayusculas = {'A', 'B', 'C', 'E', 'F'};
        char [] minusculas = {'a', 'b', 'c', 'e', 'f'};
        char [] numeros = {'1', '2', '3', '4', '5'};
        
        StringBuilder caracteres = new StringBuilder();
        caracteres.append(mayusculas);
        caracteres.append(minusculas);
        caracteres.append(numeros);
        
        StringBuilder pass = new StringBuilder();
        
        for(int i = 0; i<= 15; i++){
            int cantidadCaracteres =caracteres.length();
            int numeroRandom = (int)(Math.random()*cantidadCaracteres);
            
            pass.append((caracteres.toString()).charAt(numeroRandom));
        }
        return pass.toString();
         
    }
    
}
