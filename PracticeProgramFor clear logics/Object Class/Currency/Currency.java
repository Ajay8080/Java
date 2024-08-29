class Currency{
    private String country;
    
    Currency(String country){
        this.country=country;
    }
    public String toString(){
        return "Country Form: "+country;
    }

    public boolean equals(Object obj){
        if(this == obj){
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Currency currency = (Currency) obj;
        return country.equals(currency.country);
    }
}