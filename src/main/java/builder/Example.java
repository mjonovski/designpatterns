package builder;

public class Example {
    private String txt;
    private int num;

    public static class ExampleBuilder {
        private String txt;
        private int num;

        public ExampleBuilder(int num) {
            this.num = num;
        }

        public ExampleBuilder withTxt(String txt) {
            this.txt = txt;
            return this;
        }

        public Example build() {
            return new Example(num, txt);
        }
    }

    private Example(int num, String txt) {
        this.num = num;
        this.txt = txt;
    }
}