/*   1:    */ import org.lwjgl.opengl.GL11;
/*   2:    */ 
/*   3:    */ class cjq
/*   4:    */ {
/*   5:    */   private final int a;
/*   6:701 */   private boolean b = false;
/*   7:    */   
/*   8:    */   public cjq(int paramInt)
/*   9:    */   {
/*  10:704 */     this.a = paramInt;
/*  11:    */   }
/*  12:    */   
/*  13:    */   public void a()
/*  14:    */   {
/*  15:708 */     a(false);
/*  16:    */   }
/*  17:    */   
/*  18:    */   public void b()
/*  19:    */   {
/*  20:712 */     a(true);
/*  21:    */   }
/*  22:    */   
/*  23:    */   public void a(boolean paramBoolean)
/*  24:    */   {
/*  25:716 */     if (paramBoolean != this.b)
/*  26:    */     {
/*  27:717 */       this.b = paramBoolean;
/*  28:718 */       if (paramBoolean) {
/*  29:719 */         GL11.glEnable(this.a);
/*  30:    */       } else {
/*  31:721 */         GL11.glDisable(this.a);
/*  32:    */       }
/*  33:    */     }
/*  34:    */   }
/*  35:    */ }


/* Location:           C:\Users\Hugo Haldi\Desktop\Decompile Minecraft\1.8.jar
 * Qualified Name:     cjq
 * JD-Core Version:    0.7.0.1
 */