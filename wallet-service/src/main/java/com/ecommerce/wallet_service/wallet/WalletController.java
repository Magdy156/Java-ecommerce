package com.ecommerce.wallet_service.wallet;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
@RequestMapping("/api/v1/wallet")
public class WalletController {
    @Autowired
    private WalletService walletService;


    @PostMapping("/create/{userId}")
    public Wallet creteWallet(@PathVariable Long userId) {        
        return walletService.createWallet(userId);
    }
    

    @GetMapping("/{userId}")
    public List<Wallet> getWallet(@PathVariable Long userId) {
        return walletService.getWallet(userId);
    }
    
}
