/*   1:    */ import com.google.common.cache.CacheLoader;
/*   2:    */ 
/*   3:    */ class bel
/*   4:    */   extends CacheLoader
/*   5:    */ {
/*   6:    */   private final aqu a;
/*   7:    */   
/*   8:    */   public bel(aqu paramaqu)
/*   9:    */   {
/*  10:120 */     this.a = paramaqu;
/*  11:    */   }
/*  12:    */   
/*  13:    */   public bei a(dt paramdt)
/*  14:    */   {
/*  15:125 */     return new bei(this.a, paramdt);
/*  16:    */   }
/*  17:    */ }


/* Location:           C:\Users\Hugo Haldi\Desktop\Decompile Minecraft\1.8.jar
 * Qualified Name:     bel
 * JD-Core Version:    0.7.0.1
 */