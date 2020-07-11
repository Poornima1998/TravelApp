package com.example.travel;



public class CityItem {

        private int imageResourse1;
        private String title1;
        private String countryname;
        private String key_id;
        private String population;
        private String airport;

        //constructor
        public CityItem() {
        }



    public CityItem(int imageResourse1, String title1, String countryname, String key_id, String population, String airport) {
            this.imageResourse1 = imageResourse1;
            this.title1 = title1;
            this.countryname = countryname;
            this.key_id = key_id;
            this.population = population;
            this.airport = airport;
        }

        public int getImageResourse1() {
            return imageResourse1;
        }

        public void setImageResourse1(int imageResourse1) {
            this.imageResourse1 = imageResourse1;
        }

        public String getTitle1() {
            return title1;
        }

        public void setTitle1(String title1) {
            this.title1 = title1;
        }

        public String getCountryname() {
            return countryname;
        }

        public void setCountryname(String countryname) {
            this.countryname = countryname;
        }

        public String getKey_id() {
            return key_id;
        }

        public void setKey_id(String key_id) {
            this.key_id = key_id;
        }

        public String getPopulation() {
            return population;
        }

        public void setPopulation(String population) {
            this.population = population;
        }
        public String getAirport() {
            return airport;
        }

        public void setAirport(String airport) {
            this.airport = airport;
        }

    }
