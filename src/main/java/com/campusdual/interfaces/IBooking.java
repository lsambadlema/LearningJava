package com.campusdual.interfaces;

import java.util.Date;

public interface IBooking {


    void book(Date bookDate, String...args);   //de 0 a n números
    void cancelBook();
    void getTicketDetail();

}

