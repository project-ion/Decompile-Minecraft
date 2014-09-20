/*   1:    */ import java.util.Random;
/*   2:    */ 
/*   3:    */ class afv
/*   4:    */   extends zb
/*   5:    */ {
/*   6:    */   private aft a;
/*   7:    */   private int b;
/*   8:    */   
/*   9:    */   public afv(aft paramaft)
/*  10:    */   {
/*  11:141 */     this.a = paramaft;
/*  12:    */   }
/*  13:    */   
/*  14:    */   public void f()
/*  15:    */   {
/*  16:145 */     if (this.b == 0) {
/*  17:146 */       this.b = 20;
/*  18:    */     }
/*  19:    */   }
/*  20:    */   
/*  21:    */   public boolean a()
/*  22:    */   {
/*  23:152 */     return this.b > 0;
/*  24:    */   }
/*  25:    */   
/*  26:    */   public void e()
/*  27:    */   {
/*  28:157 */     this.b -= 1;
/*  29:158 */     if (this.b <= 0)
/*  30:    */     {
/*  31:159 */       aqu localaqu = this.a.o;
/*  32:160 */       Random localRandom = this.a.bb();
/*  33:    */       
/*  34:    */ 
/*  35:163 */       dt localdt1 = new dt(this.a);
/*  36:165 */       for (int i = 0; (i <= 5) && (i >= -5); i = i <= 0 ? 1 - i : 0 - i) {
/*  37:166 */         for (int j = 0; (j <= 10) && (j >= -10); j = j <= 0 ? 1 - j : 0 - j) {
/*  38:167 */           for (int k = 0; (k <= 10) && (k >= -10); k = k <= 0 ? 1 - k : 0 - k)
/*  39:    */           {
/*  40:168 */             dt localdt2 = localdt1.a(j, i, k);
/*  41:169 */             bec localbec = localaqu.p(localdt2);
/*  42:171 */             if (localbec.c() == aty.be)
/*  43:    */             {
/*  44:172 */               if (localaqu.Q().b("mobGriefing")) {
/*  45:173 */                 localaqu.b(localdt2, true);
/*  46:    */               } else {
/*  47:175 */                 localaqu.a(localdt2, ((axu)localbec.b(axs.a)).d(), 3);
/*  48:    */               }
/*  49:177 */               if (localRandom.nextBoolean()) {
/*  50:    */                 return;
/*  51:    */               }
/*  52:    */             }
/*  53:    */           }
/*  54:    */         }
/*  55:    */       }
/*  56:    */     }
/*  57:    */   }
/*  58:    */ }


/* Location:           C:\Users\Hugo Haldi\Desktop\Decompile Minecraft\1.8.jar
 * Qualified Name:     afv
 * JD-Core Version:    0.7.0.1
 */