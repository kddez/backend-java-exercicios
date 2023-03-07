import java.util.Arrays;
import java.util.List;
import java.util.SplittableRandom;
import java.util.stream.Collectors;

public class LambdaStream {
    
    static int gerarIdade(int min, int max){
        return new SplittableRandom().nextInt(min, max);

    }

    public static void main(String[] args){
        List<String> nomes = Arrays.asList("Alice","Jose","Samuel","Alex","Natalia");
        System.out.println("Lista de nomes: ");
        nomes.forEach((n) -> System.out.println(n));

        System.out.println("Lista de pessoas: ");
        List<Pessoa> pessoas = nomes.stream().map((p) -> new Pessoa(p, gerarIdade(15,30))).collect((Collectors.toList()));
        pessoas.forEach((p) -> System.out.println(p.getNome() + " " + p.getIdade()));

        System.out.println("Lista de pessoas maiores de idade: ");
        List<Pessoa> pessoasMaioresDeIdade = pessoas.stream().filter((p) -> p.getIdade() >= 18)
                .collect(Collectors.toList());
        pessoasMaioresDeIdade.forEach((p) -> System.out.println(p.getNome() + " " + p.getIdade()));

        System.out.println("Lista de pessoas organizadas: ");
        List<Pessoa> pessoasOrdenadas = pessoas.stream().sorted((p1, p2) -> p1.getIdade() - p2.getIdade())
                .collect(Collectors.toList());
        pessoasOrdenadas.forEach(p -> System.out.println(p.getNome() + " " + p.getIdade()));

        System.out.println("Somas das idades: ");
        Integer idadeTotal = pessoas.stream().map(p -> p.getIdade()).reduce(0,
                (somaIdade, idade) -> somaIdade += idade);
        System.out.println("Idade total: " + idadeTotal);
    }
}
