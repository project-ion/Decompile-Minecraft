/*   1:    */ import com.google.common.collect.Lists;
/*   2:    */ import java.util.Arrays;
/*   3:    */ import java.util.LinkedList;
/*   4:    */ import java.util.List;
/*   5:    */ import java.util.Map;
/*   6:    */ import java.util.Map.Entry;
/*   7:    */ import java.util.Random;
/*   8:    */ 
/*   9:    */ public class blg
/*  10:    */   extends bmm
/*  11:    */ {
/*  12: 22 */   private static final List d = Arrays.asList(new arm[] { arm.r, arm.G, arm.K, arm.L, arm.v });
/*  13: 24 */   private List f = Lists.newArrayList();
/*  14: 25 */   private int g = 32;
/*  15: 26 */   private int h = 8;
/*  16:    */   
/*  17:    */   public blg()
/*  18:    */   {
/*  19: 31 */     this.f.add(new arq(agi.class, 1, 1, 1));
/*  20:    */   }
/*  21:    */   
/*  22:    */   public blg(Map paramMap)
/*  23:    */   {
/*  24: 35 */     this();
/*  25: 37 */     for (Map.Entry localEntry : paramMap.entrySet()) {
/*  26: 38 */       if (((String)localEntry.getKey()).equals("distance")) {
/*  27: 39 */         this.g = uv.a((String)localEntry.getValue(), this.g, this.h + 1);
/*  28:    */       }
/*  29:    */     }
/*  30:    */   }
/*  31:    */   
/*  32:    */   public String a()
/*  33:    */   {
/*  34: 46 */     return "Temple";
/*  35:    */   }
/*  36:    */   
/*  37:    */   protected boolean a(int paramInt1, int paramInt2)
/*  38:    */   {
/*  39: 51 */     int i = paramInt1;
/*  40: 52 */     int j = paramInt2;
/*  41: 53 */     if (paramInt1 < 0) {
/*  42: 54 */       paramInt1 -= this.g - 1;
/*  43:    */     }
/*  44: 56 */     if (paramInt2 < 0) {
/*  45: 57 */       paramInt2 -= this.g - 1;
/*  46:    */     }
/*  47: 60 */     int k = paramInt1 / this.g;
/*  48: 61 */     int m = paramInt2 / this.g;
/*  49: 62 */     Random localRandom = this.c.a(k, m, 14357617);
/*  50: 63 */     k *= this.g;
/*  51: 64 */     m *= this.g;
/*  52: 65 */     k += localRandom.nextInt(this.g - this.h);
/*  53: 66 */     m += localRandom.nextInt(this.g - this.h);
/*  54: 67 */     paramInt1 = i;
/*  55: 68 */     paramInt2 = j;
/*  56:    */     arm localarm1;
/*  57: 70 */     if ((paramInt1 == k) && (paramInt2 == m))
/*  58:    */     {
/*  59: 71 */       localarm1 = this.c.v().a(new dt(paramInt1 * 16 + 8, 0, paramInt2 * 16 + 8));
/*  60: 72 */       if (localarm1 == null) {
/*  61: 73 */         return false;
/*  62:    */       }
/*  63: 75 */       for (arm localarm2 : d) {
/*  64: 76 */         if (localarm1 == localarm2) {
/*  65: 77 */           return true;
/*  66:    */         }
/*  67:    */       }
/*  68:    */     }
/*  69: 82 */     return false;
/*  70:    */   }
/*  71:    */   
/*  72:    */   protected bmv b(int paramInt1, int paramInt2)
/*  73:    */   {
/*  74: 87 */     return new blh(this.c, this.b, paramInt1, paramInt2);
/*  75:    */   }
/*  76:    */   
/*  77:    */   public boolean a(dt paramdt)
/*  78:    */   {
/*  79:114 */     bmv localbmv = c(paramdt);
/*  80:115 */     if ((localbmv == null) || (!(localbmv instanceof blh)) || (localbmv.a.isEmpty())) {
/*  81:116 */       return false;
/*  82:    */     }
/*  83:118 */     bms localbms = (bms)localbmv.a.getFirst();
/*  84:119 */     return localbms instanceof blo;
/*  85:    */   }
/*  86:    */   
/*  87:    */   public List b()
/*  88:    */   {
/*  89:123 */     return this.f;
/*  90:    */   }
/*  91:    */ }


/* Location:           C:\Users\Hugo Haldi\Desktop\Decompile Minecraft\1.8.jar
 * Qualified Name:     blg
 * JD-Core Version:    0.7.0.1
 */