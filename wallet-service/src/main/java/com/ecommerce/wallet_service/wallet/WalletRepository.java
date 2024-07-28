package com.ecommerce.wallet_service.wallet;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WalletRepository extends JpaRepository<Wallet, Long>{
    List<Wallet> findByUserId(Long userId);
}
