package com.ecommerce.wallet_service.wallet;

import java.math.BigDecimal;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ecommerce.wallet_service.user.User;
import com.ecommerce.wallet_service.user.UserRepository;

@Service
public class WalletService {
    
    @Autowired
    private WalletRepository walletRepository;

    @Autowired
    private UserRepository userRepository;


    public Wallet createWallet(Long userId){
        User user = userRepository.findById(userId)
        .orElseThrow(() -> new RuntimeException("User is not found"));

        Wallet wallet = new Wallet();
        wallet.setUser(user);
        wallet.setBalance(BigDecimal.ZERO);
        return walletRepository.save(wallet);
    }

    public List<Wallet> getWallet(Long userId){
        return walletRepository.findByUserId(userId);
    }
}
