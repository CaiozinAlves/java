package Alunos;

public class Alunos {

        private String matricula;
        private double nota;


        public Alunos(String matricula, double nota) {
            this.matricula = matricula;
            this.nota = nota;

        }


        public String getMatricula() {
            return matricula;
        }

        public void setMatricula(String matricula) {
            this.matricula = matricula;
        }

        public double getNota() {
            return nota;
        }

        public void setNota(double nota) {
            this.nota = nota;
        }




        public String obterConceito() {
            if (nota >= 9.0 && nota <= 10.0) {
                return "A";
            } else if (nota >= 7.0 && nota <= 8.9) {
                return "B";
            } else if (nota >= 5.0 && nota <= 6.9) {
                return "C";
            } else if (nota >= 0.0 && nota <= 4.9) {
                return "D";
            } else {
                return "Nota inválida";
            }
        }


}
