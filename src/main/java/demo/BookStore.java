package demo;

import model.*;

import java.util.ArrayList;
import java.util.List;

public class BookStore {
    public static void main(String[] args) {
        BookStore bookStore = new BookStore();
        Customer customer = new Customer();
        bookStore.buy(customer);
    }

    private void buy(Customer customer) {
        Book book1 = new Book();
        Book book2 = new Book();

        //Add book to basket
        Basket basket = new Basket(customer);
        List<Book> books = new ArrayList<Book>();
        books.add(book1);
        books.add(book2);
        basket.addBooks(books);

        //Calculate max discount
        Discount discount = new Discount();
        int maxDiscountPrice = discount.calculateDiscount(basket);

        //checkout
        Checkout checkout = new Checkout();
        checkout.process(basket, new Payment(), new Transport());
    }
}
