/*   1:    */ import com.google.common.collect.Lists;
/*   2:    */ import java.util.List;
/*   3:    */ import java.util.Random;
/*   4:    */ 
/*   5:    */ public class blv
/*   6:    */   extends bmk
/*   7:    */ {
/*   8:657 */   private static final List a = Lists.newArrayList(new vl[] { new vl(amk.bu, 0, 1, 1, 10), new vl(amk.i, 0, 1, 3, 3), new vl(amk.j, 0, 1, 5, 10), new vl(amk.k, 0, 1, 3, 5), new vl(amk.aC, 0, 4, 9, 5), new vl(amk.P, 0, 1, 3, 15), new vl(amk.e, 0, 1, 3, 15), new vl(amk.b, 0, 1, 1, 5), new vl(amk.l, 0, 1, 1, 5), new vl(amk.Z, 0, 1, 1, 5), new vl(amk.Y, 0, 1, 1, 5), new vl(amk.aa, 0, 1, 1, 5), new vl(amk.ab, 0, 1, 1, 5), new vl(amk.ao, 0, 1, 1, 1), new vl(amk.aA, 0, 1, 1, 1), new vl(amk.ck, 0, 1, 1, 1), new vl(amk.cl, 0, 1, 1, 1), new vl(amk.cm, 0, 1, 1, 1) });
/*   9:    */   private boolean b;
/*  10:    */   
/*  11:    */   public blv() {}
/*  12:    */   
/*  13:    */   public blv(int paramInt, Random paramRandom, bjb parambjb, ej paramej)
/*  14:    */   {
/*  15:691 */     super(paramInt);
/*  16:    */     
/*  17:693 */     this.m = paramej;
/*  18:694 */     this.d = a(paramRandom);
/*  19:695 */     this.l = parambjb;
/*  20:    */   }
/*  21:    */   
/*  22:    */   protected void a(fn paramfn)
/*  23:    */   {
/*  24:700 */     super.a(paramfn);
/*  25:701 */     paramfn.a("Chest", this.b);
/*  26:    */   }
/*  27:    */   
/*  28:    */   protected void b(fn paramfn)
/*  29:    */   {
/*  30:706 */     super.b(paramfn);
/*  31:707 */     this.b = paramfn.n("Chest");
/*  32:    */   }
/*  33:    */   
/*  34:    */   public void a(bms parambms, List paramList, Random paramRandom)
/*  35:    */   {
/*  36:712 */     a((bmh)parambms, paramList, paramRandom, 1, 1);
/*  37:    */   }
/*  38:    */   
/*  39:    */   public static blv a(List paramList, Random paramRandom, int paramInt1, int paramInt2, int paramInt3, ej paramej, int paramInt4)
/*  40:    */   {
/*  41:716 */     bjb localbjb = bjb.a(paramInt1, paramInt2, paramInt3, -1, -1, 0, 5, 5, 7, paramej);
/*  42:718 */     if ((!a(localbjb)) || (bms.a(paramList, localbjb) != null)) {
/*  43:719 */       return null;
/*  44:    */     }
/*  45:722 */     return new blv(paramInt4, paramRandom, localbjb, paramej);
/*  46:    */   }
/*  47:    */   
/*  48:    */   public boolean a(aqu paramaqu, Random paramRandom, bjb parambjb)
/*  49:    */   {
/*  50:727 */     if (a(paramaqu, parambjb)) {
/*  51:728 */       return false;
/*  52:    */     }
/*  53:732 */     a(paramaqu, parambjb, 0, 0, 0, 4, 4, 6, true, paramRandom, blr.c());
/*  54:    */     
/*  55:734 */     a(paramaqu, paramRandom, parambjb, this.d, 1, 1, 0);
/*  56:    */     
/*  57:736 */     a(paramaqu, paramRandom, parambjb, bml.a, 1, 1, 6);
/*  58:    */     
/*  59:    */ 
/*  60:739 */     a(paramaqu, parambjb, 3, 1, 2, 3, 1, 4, aty.bf.P(), aty.bf.P(), false);
/*  61:740 */     a(paramaqu, aty.U.a(bbg.f.a()), 3, 1, 1, parambjb);
/*  62:741 */     a(paramaqu, aty.U.a(bbg.f.a()), 3, 1, 5, parambjb);
/*  63:742 */     a(paramaqu, aty.U.a(bbg.f.a()), 3, 2, 2, parambjb);
/*  64:743 */     a(paramaqu, aty.U.a(bbg.f.a()), 3, 2, 4, parambjb);
/*  65:744 */     for (int i = 2; i <= 4; i++) {
/*  66:745 */       a(paramaqu, aty.U.a(bbg.f.a()), 2, 1, i, parambjb);
/*  67:    */     }
/*  68:748 */     if ((!this.b) && 
/*  69:749 */       (parambjb.b(new dt(a(3, 3), d(2), b(3, 3)))))
/*  70:    */     {
/*  71:750 */       this.b = true;
/*  72:751 */       a(paramaqu, parambjb, paramRandom, 3, 2, 3, vl.a(a, new vl[] { amk.cd.b(paramRandom) }), 2 + paramRandom.nextInt(2));
/*  73:    */     }
/*  74:755 */     return true;
/*  75:    */   }
/*  76:    */ }


/* Location:           C:\Users\Hugo Haldi\Desktop\Decompile Minecraft\1.8.jar
 * Qualified Name:     blv
 * JD-Core Version:    0.7.0.1
 */