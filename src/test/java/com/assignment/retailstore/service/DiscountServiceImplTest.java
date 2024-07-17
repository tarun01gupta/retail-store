package com.assignment.retailstore.service;

import com.assignment.retailstore.entity.User;
import com.assignment.retailstore.service.impl.DiscountService;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DiscountServiceImplTest {

    @Mock
    DiscountService discountService;

    @Test
    public void testEmployeeDiscount() {
        User user = mockUser();
        double discount = discountService.calculateDiscount(user.getId(), 200);
        assertEquals(60, discount);
    }

    @Test
    public void testAffiliateDiscount() {
        User user = new User();
        user.setUserType("Affiliate");
        double discount = discountService.calculateDiscount(user.getId(), 200);
        assertEquals(25, discount);
    }

    @Test
    public void testCustomerOver2YearsDiscount() {
        User user = new User();
        user.setCreatedDate(LocalDateTime.now().minusYears(3));
        double discount = discountService.calculateDiscount(user.getId(), 200);
        assertEquals(15, discount);
    }

    @Test
    public void testCustomerLessThan2YearsNoDiscount() {
        User user = new User();
        user.setCreatedDate(LocalDateTime.now().minusYears(1));
        double discount = discountService.calculateDiscount(user.getId(), 200);
        assertEquals(10, discount);
    }

    private User mockUser() {
        User user = new User();
        user.setId(1L);
        user.setUserType("Employee");
        user.setFirstName("Test");
        user.setLastName("Test");
        user.setCreatedDate(LocalDateTime.of(2022, 1, 1, 0, 0));
        return user;
    }

}
