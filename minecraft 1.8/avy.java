/*   1:    */ import java.util.List;
/*   2:    */ 
/*   3:    */ public abstract class avy
/*   4:    */   extends auc
/*   5:    */ {
/*   6:    */   protected bev a;
/*   7:    */   
/*   8:    */   protected avy()
/*   9:    */   {
/*  10: 23 */     super(bof.k);
/*  11: 24 */     j(this.L.b().a(l(), j() == awc.b ? awa.b : awa.a));
/*  12:    */   }
/*  13:    */   
/*  14:    */   public int a(bec parambec)
/*  15:    */   {
/*  16: 29 */     return ((awa)parambec.b(l())).b();
/*  17:    */   }
/*  18:    */   
/*  19:    */   public void a(alq paramalq, akf paramakf, List paramList)
/*  20:    */   {
/*  21: 34 */     for (awa localawa : awa.a(j())) {
/*  22: 35 */       paramList.add(new amj(paramalq, 1, localawa.b()));
/*  23:    */     }
/*  24:    */   }
/*  25:    */   
/*  26:    */   public bec a(int paramInt)
/*  27:    */   {
/*  28: 41 */     return P().a(l(), awa.a(j(), paramInt));
/*  29:    */   }
/*  30:    */   
/*  31:    */   public abstract awc j();
/*  32:    */   
/*  33:    */   public bex l()
/*  34:    */   {
/*  35: 48 */     if (this.a == null) {
/*  36: 49 */       this.a = bev.a("type", awa.class, new avz(this));
/*  37:    */     }
/*  38: 56 */     return this.a;
/*  39:    */   }
/*  40:    */   
/*  41:    */   public int c(bec parambec)
/*  42:    */   {
/*  43: 61 */     return ((awa)parambec.b(l())).b();
/*  44:    */   }
/*  45:    */   
/*  46:    */   protected bed e()
/*  47:    */   {
/*  48: 66 */     return new bed(this, new bex[] { l() });
/*  49:    */   }
/*  50:    */   
/*  51:    */   public atw Q()
/*  52:    */   {
/*  53:169 */     return atw.b;
/*  54:    */   }
/*  55:    */ }


/* Location:           C:\Users\Hugo Haldi\Desktop\Decompile Minecraft\1.8.jar
 * Qualified Name:     avy
 * JD-Core Version:    0.7.0.1
 */