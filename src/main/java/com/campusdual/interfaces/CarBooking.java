package com.campusdual.interfaces;

import java.text.SimpleDateFormat;
import java.util.Date;

public class CarBooking implements IBooking{
    private String licensePlate;
    private boolean booked;
    private Date bookDate;
    private  SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");


    public CarBooking(String licensePlate) {
        this.licensePlate = licensePlate;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }

    public boolean isBooked() {
        return booked;
    }

    public void setBooked(boolean booked) {
        this.booked = booked;
    }

    public Date getBookDate() {
        return bookDate;
    }

    public void setBookDate(Date bookDate) {
        this.bookDate = bookDate;
    }

    @Override
    public void book(Date bookDate, String... args) {
        if(!this.booked){ //é o mismo que poñer (!this.isBooked)
            this.booked = true;
            this.bookDate = bookDate;
            System.out.println(this.licensePlate + " car booked succesfully.");
        }else{
            System.out.println(this.licensePlate + " car is already booked.");
        }
    }

    @Override
    public void cancelBook() {

        if(this.booked){
            this.booked = false;
            System.out.println("Booking for " + this.licensePlate + " cancelled.");
        }else{
            System.out.println(this.licensePlate + " is not rented.");
        }

    }

    @Override
    public void getTicketDetail() {

        if(this.booked){
            System.out.println(this.licensePlate + " car booked for " + this.sdf.format(this.bookDate));
        }else{
            System.out.println(this.licensePlate + " car is not rented.");
        }

    }
}
