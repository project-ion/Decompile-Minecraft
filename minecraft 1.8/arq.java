/*   1:    */ public class arq
/*   2:    */   extends vk
/*   3:    */ {
/*   4:    */   public Class b;
/*   5:    */   public int c;
/*   6:    */   public int d;
/*   7:    */   
/*   8:    */   public arq(Class paramClass, int paramInt1, int paramInt2, int paramInt3)
/*   9:    */   {
/*  10:341 */     super(paramInt1);
/*  11:342 */     this.b = paramClass;
/*  12:343 */     this.c = paramInt2;
/*  13:344 */     this.d = paramInt3;
/*  14:    */   }
/*  15:    */   
/*  16:    */   public String toString()
/*  17:    */   {
/*  18:349 */     return this.b.getSimpleName() + "*(" + this.c + "-" + this.d + "):" + this.a;
/*  19:    */   }
/*  20:    */ }


/* Location:           C:\Users\Hugo Haldi\Desktop\Decompile Minecraft\1.8.jar
 * Qualified Name:     arq
 * JD-Core Version:    0.7.0.1
 */