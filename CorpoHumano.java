public class CorpoHumano {
    private float massa;
    private float altura;
    private float volume;

    public CorpoHumano(float massa, float altura, float volume) {
        this.massa = massa;
        this.altura = altura;
        this.volume = volume;
    }

    // Getters
    public float getMassa() {
        return massa;
    }

    public float getAltura() {
        return altura;
    }

    public float getVolume() {
        return volume;
    }

    // Setters (com validação)
    public void setMassa(float massa) {
        if (massa > 0) {
            this.massa = massa;
        } else {
            System.out.println("Massa inválida. Massa deve ser positiva.");
        }
    }

    public void setAltura(float altura) {
        if (altura > 0) {
            this.altura = altura;
        } else {
            System.out.println("Altura inválida. Altura deve ser positiva.");
        }
    }

    public void setVolume(float volume) {
        if (volume > 0) {
            this.volume = volume;
        } else {
            System.out.println("Volume inválido. Volume deve ser positivo.");
        }
    }

    // Método para calcular o IMC
    public float calcularIMC() {
        if (altura > 0) {
            return massa / (altura * altura);
        } else {
            System.out.println("Altura inválida. Não é possível calcular o IMC.");
            return -1; // Retorna um valor inválido para indicar erro
        }
    }
}

/*
 * c1.massa = "2";: Isso geraria um erro de compilação, pois o atributo massa é
 * privado. O encapsulamento impede o acesso direto a atributos privados de fora
 * da classe.
 * Conclusão: O modificador de acesso private garante a segurança dos dados
 * internos da classe, evitando modificações acidentais ou não desejadas.
 * Alterando para public: Se massa fosse público, qualquer parte do código
 * poderia modificá-lo diretamente. Isso quebra o encapsulamento e pode levar a
 * problemas de consistência de dados.
 * Alterando o setter para privado: Se o setter fosse privado, não seria
 * possível modificar o valor de volume de fora da classe, mesmo usando um
 * objeto da classe.
 */