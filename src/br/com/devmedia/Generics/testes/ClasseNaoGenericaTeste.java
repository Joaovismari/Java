package br.com.devmedia.Generics.testes;

import br.com.devmedia.Generics.classes.Carro;

import java.util.ArrayList;
import java.util.List;

public class ClasseNaoGenericaTeste {
    public static void main(String[] args) {
        CarroAlugavel ca = new CarroAlugavel();
        Carro carroAlugado = ca.getCarroDisponivel();
        System.out.println("Usando o carro por um mês");
        ca.devolverCarro(carroAlugado);

    }
    static class CarroAlugavel{
        private List<Carro> carrosDisponiveis = new ArrayList<>();

        {
            carrosDisponiveis.add(new Carro("GOL"));
            carrosDisponiveis.add(new Carro("BMW"));
        }
        //alugar
        public Carro getCarroDisponivel(){

            Carro c = carrosDisponiveis.remove(0);
            System.out.println("Alugando carro: "+ c);
            System.out.println("Carros Disponiveís: "+ carrosDisponiveis);
            return c;
        }
        public void devolverCarro(Carro c){
            System.out.println("Devolvendo carro: "+ c);
            carrosDisponiveis.add(c);
            System.out.println("Carros Disponiveís: "+ carrosDisponiveis);
        }
    }
}
