/*  1:   */ import java.util.Random;
/*  2:   */ 
/*  3:   */ public class azv
/*  4:   */   extends atr
/*  5:   */ {
/*  6:   */   private final boolean a;
/*  7:   */   
/*  8:   */   public azv(boolean paramBoolean)
/*  9:   */   {
/* 10:17 */     super(bof.t);
/* 11:18 */     this.a = paramBoolean;
/* 12:20 */     if (paramBoolean) {
/* 13:21 */       a(1.0F);
/* 14:   */     }
/* 15:   */   }
/* 16:   */   
/* 17:   */   public void c(aqu paramaqu, dt paramdt, bec parambec)
/* 18:   */   {
/* 19:27 */     if (paramaqu.D) {
/* 20:28 */       return;
/* 21:   */     }
/* 22:31 */     if ((this.a) && (!paramaqu.z(paramdt))) {
/* 23:32 */       paramaqu.a(paramdt, aty.bJ.P(), 2);
/* 24:33 */     } else if ((!this.a) && (paramaqu.z(paramdt))) {
/* 25:34 */       paramaqu.a(paramdt, aty.bK.P(), 2);
/* 26:   */     }
/* 27:   */   }
/* 28:   */   
/* 29:   */   public void a(aqu paramaqu, dt paramdt, bec parambec, atr paramatr)
/* 30:   */   {
/* 31:40 */     if (paramaqu.D) {
/* 32:41 */       return;
/* 33:   */     }
/* 34:44 */     if ((this.a) && (!paramaqu.z(paramdt))) {
/* 35:45 */       paramaqu.a(paramdt, this, 4);
/* 36:46 */     } else if ((!this.a) && (paramaqu.z(paramdt))) {
/* 37:47 */       paramaqu.a(paramdt, aty.bK.P(), 2);
/* 38:   */     }
/* 39:   */   }
/* 40:   */   
/* 41:   */   public void b(aqu paramaqu, dt paramdt, bec parambec, Random paramRandom)
/* 42:   */   {
/* 43:53 */     if (paramaqu.D) {
/* 44:54 */       return;
/* 45:   */     }
/* 46:57 */     if ((this.a) && (!paramaqu.z(paramdt))) {
/* 47:58 */       paramaqu.a(paramdt, aty.bJ.P(), 2);
/* 48:   */     }
/* 49:   */   }
/* 50:   */   
/* 51:   */   public alq a(bec parambec, Random paramRandom, int paramInt)
/* 52:   */   {
/* 53:65 */     return alq.a(aty.bJ);
/* 54:   */   }
/* 55:   */   
/* 56:   */   public alq b(aqu paramaqu, dt paramdt)
/* 57:   */   {
/* 58:70 */     return alq.a(aty.bJ);
/* 59:   */   }
/* 60:   */   
/* 61:   */   protected amj i(bec parambec)
/* 62:   */   {
/* 63:75 */     return new amj(aty.bJ);
/* 64:   */   }
/* 65:   */ }


/* Location:           C:\Users\Hugo Haldi\Desktop\Decompile Minecraft\1.8.jar
 * Qualified Name:     azv
 * JD-Core Version:    0.7.0.1
 */