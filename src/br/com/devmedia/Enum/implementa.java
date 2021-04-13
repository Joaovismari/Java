package br.com.devmedia.Enum;

public class implementa {
    public static void main(String[] args) {
        Curso c = new Curso();
        c.setNome("Ciência da Computação");
        c.setHoras(220);
        c.setTurno(Turno.NOITE);
        System.out.println(c);
        System.out.println("Teste de Enum com opções");
        escolheOpcao(OpcoesMenu.ABRIR);
        escolheOpcao(OpcoesMenu.SALVAR);
        comparaEnum(OpcoesMenu.ABRIR);
        for(OpcoesMenu op : OpcoesMenu.values()){
            System.out.print("Menu " + op + " = " + op.getValor()+"\n");
        }
    }

    public static void escolheOpcao(OpcoesMenu opcao) {
        if (opcao == OpcoesMenu.SALVAR) {
            System.out.println("Salvando o arquivo!");
        } else if (opcao == OpcoesMenu.ABRIR) {
            System.out.println("Abrindo o arquivo!");
        }
    }

    public static void comparaEnum(OpcoesMenu opcao) {
        if (opcao.equals(OpcoesMenu.SALVAR)) {
            System.out.println("Foi escolhido a opção Salvar");
        } else if (opcao.equals(OpcoesMenu.ABRIR)) {
            System.out.println("Foi escolhido a opção ABRIR");
        } else if (opcao.equals(OpcoesMenu.FECHAR)) {
            System.out.println("Foi escolhido a opção FECHAR");
        }
    }
}
