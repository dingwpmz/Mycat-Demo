package persistent.prestige.modules.eshop.service.impl;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import persistent.prestige.modules.eshop.dao.GoodsDao;
import persistent.prestige.modules.eshop.dao.SkuDao;
import persistent.prestige.modules.eshop.dao.SkuItemDao;
import persistent.prestige.modules.eshop.model.Goods;
import persistent.prestige.modules.eshop.model.Sku;
import persistent.prestige.modules.eshop.model.SkuItem;
import persistent.prestige.modules.eshop.service.EsDataInitService;

@Service("esDataInitService")
public class EsDataInitServiceImpl implements EsDataInitService {
	
	@Autowired
	private GoodsDao goodsDao;
	
	@Autowired
	private SkuDao skuDao;
	
	@Autowired
	private SkuItemDao skuItemDao;

	@Override
	public void saveInitGoodsData() {
		
		for(int i = 0 ; i < 100; i ++) { //初始化100个商品
			Goods g = new Goods();
			g.setGoodsClassId(1);
			g.setGoodsName("商品名称" + i);
			g.setGoodsImgKey("d1df5fdjiwnbiage1n");
			g.setGoodsDesc("商品描述" + i);
			g.setStatus(1);
			g.setCreateTime(new Date(System.currentTimeMillis()));
			goodsDao.create(g);
			
			//每个商品创建3个货品
			for(int j =0, n = randSkuNum(); j < n; j ++ ) {
				Sku s = new Sku();
				s.setGoodsId(g.getId());
				s.setPrice(randSkuPrice() * 100 );
				s.setStoreCount(30);
				s.setCreateTime(new Date(System.currentTimeMillis()));
				s.setSkuNo( datetimeStr() + fillZero(i + "", 3)  );
				skuDao.create(s);
				
				long t = randSkuPrice();
				
				if(t < 8) {
					SkuItem item1 = new SkuItem();
					item1.setSkuId(s.getId());
					item1.setItemName("颜色");
					item1.setItemValue("红色");
					item1.setGoodsId(g.getId());
					skuItemDao.create(item1);
					
					SkuItem item2 = new SkuItem();
					item2.setSkuId(s.getId());
					item2.setItemName("尺寸");
					item2.setItemValue("小码");
					item2.setGoodsId(g.getId());
					skuItemDao.create(item2);
					
				} else if(i > 8 && i <=15){
					SkuItem item1 = new SkuItem();
					item1.setSkuId(s.getId());
					item1.setItemName("颜色");
					item1.setItemValue("蓝色");
					item1.setGoodsId(g.getId());
					skuItemDao.create(item1);
					
					SkuItem item2 = new SkuItem();
					item2.setSkuId(s.getId());
					item2.setItemName("尺寸");
					item2.setItemValue("中码");
					item2.setGoodsId(g.getId());
					skuItemDao.create(item2);
				} else {
					SkuItem item1 = new SkuItem();
					item1.setSkuId(s.getId());
					item1.setItemName("颜色");
					item1.setItemValue("红色");
					item1.setGoodsId(g.getId());
					skuItemDao.create(item1);
					
					SkuItem item2 = new SkuItem();
					item2.setSkuId(s.getId());
					item2.setItemName("尺寸");
					item2.setItemValue("大码");
					item2.setGoodsId(g.getId());
					skuItemDao.create(item2);
				}
				
			}
			
		}
		
	}
	
	
	private int randSkuNum() {
		Random r = new Random();
		return r.nextInt(2) + 1;
	}
	
	private long randSkuPrice() {
		Random r = new Random();
		return r.nextInt(20) + 1;
	}
	
	private String fillZero(String no, int z) {
		if(no.length() >= z ) return no;
		for(int i = no.length(); i < z; i ++) {
			no = "0" + no;
		}
		return no;
	}
	
	private String datetimeStr() {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmss");
		return sdf.format(new Date(System.currentTimeMillis()));
	}
	

}
