package com.itheima.pyg.service.cart;

import com.itheima.pyg.entity.vo.Cart;

import java.util.List;

public interface CartService {

    /**
     * 向购物车列表中添加商品
     * @param cartList
     * @param itemId
     * @param num
     * @return
     */
    List<Cart>  addGoodsToCartList(List<Cart> cartList,Long itemId,Integer num);

    /**
     * 从redis中获取购物车列表
     * @param username
     * @return
     */
    List<Cart>  findCartListFromRedis(String username);

    /**
     * 向redis中存储购物车列表
     * @param username
     * @param cartList
     */
    void saveCartListToRedis(String username,List<Cart> cartList);

    /**
     * 合并购物车列表
     * @param cartList1
     * @param cartList2
     * @return
     */
    List<Cart>  mergeCartList(List<Cart> cartList1,List<Cart> cartList2);
}
