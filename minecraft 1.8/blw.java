/*   1:    */ import java.util.List;
/*   2:    */ import java.util.Random;
/*   3:    */ 
/*   4:    */ public class blw
/*   5:    */   extends bmk
/*   6:    */ {
/*   7:    */   private int a;
/*   8:    */   
/*   9:    */   public blw() {}
/*  10:    */   
/*  11:    */   public blw(int paramInt, Random paramRandom, bjb parambjb, ej paramej)
/*  12:    */   {
/*  13:359 */     super(paramInt);
/*  14:    */     
/*  15:361 */     this.m = paramej;
/*  16:362 */     this.l = parambjb;
/*  17:363 */     this.a = ((paramej == ej.c) || (paramej == ej.d) ? parambjb.e() : parambjb.c());
/*  18:    */   }
/*  19:    */   
/*  20:    */   protected void a(fn paramfn)
/*  21:    */   {
/*  22:368 */     super.a(paramfn);
/*  23:369 */     paramfn.a("Steps", this.a);
/*  24:    */   }
/*  25:    */   
/*  26:    */   protected void b(fn paramfn)
/*  27:    */   {
/*  28:374 */     super.b(paramfn);
/*  29:375 */     this.a = paramfn.f("Steps");
/*  30:    */   }
/*  31:    */   
/*  32:    */   public static bjb a(List paramList, Random paramRandom, int paramInt1, int paramInt2, int paramInt3, ej paramej)
/*  33:    */   {
/*  34:379 */     int i = 3;
/*  35:    */     
/*  36:381 */     bjb localbjb = bjb.a(paramInt1, paramInt2, paramInt3, -1, -1, 0, 5, 5, 4, paramej);
/*  37:    */     
/*  38:383 */     bms localbms = bms.a(paramList, localbjb);
/*  39:384 */     if (localbms == null) {
/*  40:386 */       return null;
/*  41:    */     }
/*  42:389 */     if (localbms.c().b == localbjb.b) {
/*  43:391 */       for (int j = 3; j >= 1; j--)
/*  44:    */       {
/*  45:392 */         localbjb = bjb.a(paramInt1, paramInt2, paramInt3, -1, -1, 0, 5, 5, j - 1, paramej);
/*  46:393 */         if (!localbms.c().a(localbjb)) {
/*  47:396 */           return bjb.a(paramInt1, paramInt2, paramInt3, -1, -1, 0, 5, 5, j, paramej);
/*  48:    */         }
/*  49:    */       }
/*  50:    */     }
/*  51:401 */     return null;
/*  52:    */   }
/*  53:    */   
/*  54:    */   public boolean a(aqu paramaqu, Random paramRandom, bjb parambjb)
/*  55:    */   {
/*  56:406 */     if (a(paramaqu, parambjb)) {
/*  57:407 */       return false;
/*  58:    */     }
/*  59:411 */     for (int i = 0; i < this.a; i++)
/*  60:    */     {
/*  61:413 */       a(paramaqu, aty.bf.P(), 0, 0, i, parambjb);
/*  62:414 */       a(paramaqu, aty.bf.P(), 1, 0, i, parambjb);
/*  63:415 */       a(paramaqu, aty.bf.P(), 2, 0, i, parambjb);
/*  64:416 */       a(paramaqu, aty.bf.P(), 3, 0, i, parambjb);
/*  65:417 */       a(paramaqu, aty.bf.P(), 4, 0, i, parambjb);
/*  66:419 */       for (int j = 1; j <= 3; j++)
/*  67:    */       {
/*  68:420 */         a(paramaqu, aty.bf.P(), 0, j, i, parambjb);
/*  69:421 */         a(paramaqu, aty.a.P(), 1, j, i, parambjb);
/*  70:422 */         a(paramaqu, aty.a.P(), 2, j, i, parambjb);
/*  71:423 */         a(paramaqu, aty.a.P(), 3, j, i, parambjb);
/*  72:424 */         a(paramaqu, aty.bf.P(), 4, j, i, parambjb);
/*  73:    */       }
/*  74:427 */       a(paramaqu, aty.bf.P(), 0, 4, i, parambjb);
/*  75:428 */       a(paramaqu, aty.bf.P(), 1, 4, i, parambjb);
/*  76:429 */       a(paramaqu, aty.bf.P(), 2, 4, i, parambjb);
/*  77:430 */       a(paramaqu, aty.bf.P(), 3, 4, i, parambjb);
/*  78:431 */       a(paramaqu, aty.bf.P(), 4, 4, i, parambjb);
/*  79:    */     }
/*  80:434 */     return true;
/*  81:    */   }
/*  82:    */ }


/* Location:           C:\Users\Hugo Haldi\Desktop\Decompile Minecraft\1.8.jar
 * Qualified Name:     blw
 * JD-Core Version:    0.7.0.1
 */