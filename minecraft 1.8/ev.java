/*  1:   */ import com.google.common.collect.BiMap;
/*  2:   */ import com.google.common.collect.HashBiMap;
/*  3:   */ import java.util.Iterator;
/*  4:   */ import java.util.Map;
/*  5:   */ 
/*  6:   */ public class ev
/*  7:   */   extends fb
/*  8:   */   implements eq
/*  9:   */ {
/* 10:11 */   protected final er a = new er();
/* 11:   */   protected final Map b;
/* 12:   */   
/* 13:   */   public ev()
/* 14:   */   {
/* 15:17 */     this.b = ((BiMap)this.c).inverse();
/* 16:   */   }
/* 17:   */   
/* 18:   */   public void a(int paramInt, Object paramObject1, Object paramObject2)
/* 19:   */   {
/* 20:21 */     this.a.a(paramObject2, paramInt);
/* 21:22 */     a(paramObject1, paramObject2);
/* 22:   */   }
/* 23:   */   
/* 24:   */   protected Map b()
/* 25:   */   {
/* 26:27 */     return HashBiMap.create();
/* 27:   */   }
/* 28:   */   
/* 29:   */   public Object a(Object paramObject)
/* 30:   */   {
/* 31:33 */     return super.a(paramObject);
/* 32:   */   }
/* 33:   */   
/* 34:   */   public Object c(Object paramObject)
/* 35:   */   {
/* 36:38 */     return this.b.get(paramObject);
/* 37:   */   }
/* 38:   */   
/* 39:   */   public boolean d(Object paramObject)
/* 40:   */   {
/* 41:43 */     return super.d(paramObject);
/* 42:   */   }
/* 43:   */   
/* 44:   */   public int b(Object paramObject)
/* 45:   */   {
/* 46:48 */     return this.a.b(paramObject);
/* 47:   */   }
/* 48:   */   
/* 49:   */   public Object a(int paramInt)
/* 50:   */   {
/* 51:54 */     return this.a.a(paramInt);
/* 52:   */   }
/* 53:   */   
/* 54:   */   public Iterator iterator()
/* 55:   */   {
/* 56:59 */     return this.a.iterator();
/* 57:   */   }
/* 58:   */ }


/* Location:           C:\Users\Hugo Haldi\Desktop\Decompile Minecraft\1.8.jar
 * Qualified Name:     ev
 * JD-Core Version:    0.7.0.1
 */