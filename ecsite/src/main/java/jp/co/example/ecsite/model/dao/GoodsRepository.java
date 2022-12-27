package jp.co.example.ecsite.model.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import jp.co.example.ecsite.model.entity.Goods;

public interface GoodsRepository extends JpaRepository<Goods,Long>{

}
