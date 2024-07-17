package com.assignment.retailstore.controller;

import com.assignment.retailstore.service.IDiscountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Controller class for the Discount Applicable for the User
 */
@RestController
@RequestMapping("/api/discount")
public class DiscountController {
    @Autowired
    private IDiscountService discountService;

    /**
     * calculate discount for the give
     * @param userId user id of the user
     * @param amount bill amount
     * @return ResponseEntity containing the net discount amount
     */
    @GetMapping("{userid}/{amount}")
    public ResponseEntity calculateDiscount(@PathVariable("userid") Long userId, @PathVariable("amount") int amount) {
        try {
            double netPayableAmount = discountService.calculateDiscount(userId, amount);
            return new ResponseEntity(netPayableAmount, HttpStatus.OK);
        } catch (IllegalArgumentException exception) {
            return new ResponseEntity(exception.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
