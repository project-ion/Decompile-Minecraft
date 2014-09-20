/*   1:    */ import com.google.common.cache.LoadingCache;
/*   2:    */ 
/*   3:    */ public class bem
/*   4:    */ {
/*   5:    */   private final dt a;
/*   6:    */   private final ej b;
/*   7:    */   private final ej c;
/*   8:    */   private final LoadingCache d;
/*   9:    */   
/*  10:    */   public bem(dt paramdt, ej paramej1, ej paramej2, LoadingCache paramLoadingCache)
/*  11:    */   {
/*  12:136 */     this.a = paramdt;
/*  13:137 */     this.b = paramej1;
/*  14:138 */     this.c = paramej2;
/*  15:139 */     this.d = paramLoadingCache;
/*  16:    */   }
/*  17:    */   
/*  18:    */   public ej b()
/*  19:    */   {
/*  20:147 */     return this.b;
/*  21:    */   }
/*  22:    */   
/*  23:    */   public ej c()
/*  24:    */   {
/*  25:151 */     return this.c;
/*  26:    */   }
/*  27:    */   
/*  28:    */   public bei a(int paramInt1, int paramInt2, int paramInt3)
/*  29:    */   {
/*  30:155 */     return (bei)this.d.getUnchecked(bek.a(this.a, b(), c(), paramInt1, paramInt2, paramInt3));
/*  31:    */   }
/*  32:    */ }


/* Location:           C:\Users\Hugo Haldi\Desktop\Decompile Minecraft\1.8.jar
 * Qualified Name:     bem
 * JD-Core Version:    0.7.0.1
 */