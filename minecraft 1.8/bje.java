/*   1:    */ import com.google.common.collect.Lists;
/*   2:    */ import java.util.List;
/*   3:    */ import java.util.Random;
/*   4:    */ 
/*   5:    */ public class bje
/*   6:    */ {
/*   7:    */   public static void a()
/*   8:    */   {
/*   9: 37 */     bmq.a(bjg.class, "MSCorridor");
/*  10: 38 */     bmq.a(bjh.class, "MSCrossing");
/*  11: 39 */     bmq.a(bji.class, "MSRoom");
/*  12: 40 */     bmq.a(bjj.class, "MSStairs");
/*  13:    */   }
/*  14:    */   
/*  15:    */   private static bms a(List paramList, Random paramRandom, int paramInt1, int paramInt2, int paramInt3, ej paramej, int paramInt4)
/*  16:    */   {
/*  17: 44 */     int i = paramRandom.nextInt(100);
/*  18:    */     bjb localbjb;
/*  19: 45 */     if (i >= 80)
/*  20:    */     {
/*  21: 46 */       localbjb = bjh.a(paramList, paramRandom, paramInt1, paramInt2, paramInt3, paramej);
/*  22: 47 */       if (localbjb != null) {
/*  23: 48 */         return new bjh(paramInt4, paramRandom, localbjb, paramej);
/*  24:    */       }
/*  25:    */     }
/*  26: 50 */     else if (i >= 70)
/*  27:    */     {
/*  28: 51 */       localbjb = bjj.a(paramList, paramRandom, paramInt1, paramInt2, paramInt3, paramej);
/*  29: 52 */       if (localbjb != null) {
/*  30: 53 */         return new bjj(paramInt4, paramRandom, localbjb, paramej);
/*  31:    */       }
/*  32:    */     }
/*  33:    */     else
/*  34:    */     {
/*  35: 56 */       localbjb = bjg.a(paramList, paramRandom, paramInt1, paramInt2, paramInt3, paramej);
/*  36: 57 */       if (localbjb != null) {
/*  37: 58 */         return new bjg(paramInt4, paramRandom, localbjb, paramej);
/*  38:    */       }
/*  39:    */     }
/*  40: 62 */     return null;
/*  41:    */   }
/*  42:    */   
/*  43:    */   private static bms b(bms parambms, List paramList, Random paramRandom, int paramInt1, int paramInt2, int paramInt3, ej paramej, int paramInt4)
/*  44:    */   {
/*  45: 66 */     if (paramInt4 > 8) {
/*  46: 67 */       return null;
/*  47:    */     }
/*  48: 69 */     if ((Math.abs(paramInt1 - parambms.c().a) > 80) || (Math.abs(paramInt3 - parambms.c().c) > 80)) {
/*  49: 70 */       return null;
/*  50:    */     }
/*  51: 73 */     bms localbms = a(paramList, paramRandom, paramInt1, paramInt2, paramInt3, paramej, paramInt4 + 1);
/*  52: 74 */     if (localbms != null)
/*  53:    */     {
/*  54: 75 */       paramList.add(localbms);
/*  55: 76 */       localbms.a(parambms, paramList, paramRandom);
/*  56:    */     }
/*  57: 78 */     return localbms;
/*  58:    */   }
/*  59:    */   
/*  60:697 */   private static final List a = Lists.newArrayList(new vl[] { new vl(amk.j, 0, 1, 5, 10), new vl(amk.k, 0, 1, 3, 5), new vl(amk.aC, 0, 4, 9, 5), new vl(amk.aW, akv.l.b(), 4, 9, 5), new vl(amk.i, 0, 1, 2, 3), new vl(amk.h, 0, 3, 8, 10), new vl(amk.P, 0, 1, 3, 15), new vl(amk.b, 0, 1, 1, 1), new vl(alq.a(aty.av), 0, 4, 8, 1), new vl(amk.bh, 0, 2, 4, 10), new vl(amk.bg, 0, 2, 4, 10), new vl(amk.aA, 0, 1, 1, 3), new vl(amk.ck, 0, 1, 1, 1) });
/*  61:    */ }


/* Location:           C:\Users\Hugo Haldi\Desktop\Decompile Minecraft\1.8.jar
 * Qualified Name:     bje
 * JD-Core Version:    0.7.0.1
 */