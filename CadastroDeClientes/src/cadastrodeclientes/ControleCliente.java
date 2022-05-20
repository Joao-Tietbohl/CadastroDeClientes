
package cadastrodeclientes;

import java.util.ArrayList;

public class ControleCliente {
    public ArrayList<Cliente> registros;


    public ControleCliente() {
        registros = new ArrayList<>();
    }
    public void Inserir(Cliente entidade){
        registros.add(entidade);
    }
    
    public void Excluir(int id){
        registros.remove(id);
    }
    
    public ArrayList<Cliente> selecionarTodos(){
        return registros;
    }
    
    public Cliente SelecionarPorId(int id){
        return registros.get(id);
    }
}
  

