class Books {
    String title;
    String[] authors;

            public static void main(String[] args) {
                Books books1 = new Books();
                books1.title = "Beginning Java";
                books1.authors = new String[]{
                "Bart Baesens",
                "Aimee Backiel",
                "Seppe vanden Broucke"
                };
                Books books2 = new Books();
                books2.title = "Catcher in the Rye";
                books2.authors = new String[]{"J. D. Salinger"};

                Books books3 = new Books();
                // Oops, forgot to set title...
                System.out.println("Title equals: "+books3.title);

            }    
    }   