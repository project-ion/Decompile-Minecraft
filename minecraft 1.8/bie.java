/*   1:    */ import com.google.common.collect.Lists;
/*   2:    */ import java.util.Iterator;
/*   3:    */ import java.util.List;
/*   4:    */ import java.util.Random;
/*   5:    */ import org.apache.logging.log4j.LogManager;
/*   6:    */ import org.apache.logging.log4j.Logger;
/*   7:    */ 
/*   8:    */ public class bie
/*   9:    */   extends bhp
/*  10:    */ {
/*  11: 22 */   private static final Logger a = ;
/*  12: 25 */   private static final String[] b = { "Skeleton", "Zombie", "Zombie", "Spider" };
/*  13: 26 */   private static final List c = Lists.newArrayList(new vl[] { new vl(amk.aA, 0, 1, 1, 10), new vl(amk.j, 0, 1, 4, 10), new vl(amk.P, 0, 1, 1, 10), new vl(amk.O, 0, 1, 4, 10), new vl(amk.H, 0, 1, 4, 10), new vl(amk.F, 0, 1, 4, 10), new vl(amk.aw, 0, 1, 1, 10), new vl(amk.ao, 0, 1, 1, 1), new vl(amk.aC, 0, 1, 4, 10), new vl(amk.cq, 0, 1, 1, 4), new vl(amk.cr, 0, 1, 1, 4), new vl(amk.co, 0, 1, 1, 10), new vl(amk.cl, 0, 1, 1, 2), new vl(amk.ck, 0, 1, 1, 5), new vl(amk.cm, 0, 1, 1, 1) });
/*  14:    */   
/*  15:    */   public boolean b(aqu paramaqu, Random paramRandom, dt paramdt)
/*  16:    */   {
/*  17: 47 */     int i = 3;
/*  18: 48 */     int j = paramRandom.nextInt(2) + 2;
/*  19: 49 */     int k = -j - 1;
/*  20: 50 */     int m = j + 1;
/*  21:    */     
/*  22: 52 */     int n = -1;
/*  23: 53 */     int i1 = 4;
/*  24:    */     
/*  25: 55 */     int i2 = paramRandom.nextInt(2) + 2;
/*  26: 56 */     int i3 = -i2 - 1;
/*  27: 57 */     int i4 = i2 + 1;
/*  28:    */     
/*  29: 59 */     int i5 = 0;
/*  30:    */     int i7;
/*  31:    */     int i8;
/*  32:    */     dt localdt1;
/*  33: 60 */     for (int i6 = k; i6 <= m; i6++) {
/*  34: 61 */       for (i7 = -1; i7 <= 4; i7++) {
/*  35: 62 */         for (i8 = i3; i8 <= i4; i8++)
/*  36:    */         {
/*  37: 63 */           localdt1 = paramdt.a(i6, i7, i8);
/*  38: 64 */           bof localbof = paramaqu.p(localdt1).c().r();
/*  39: 65 */           boolean bool = localbof.a();
/*  40: 67 */           if ((i7 == -1) && (!bool)) {
/*  41: 68 */             return false;
/*  42:    */           }
/*  43: 70 */           if ((i7 == 4) && (!bool)) {
/*  44: 71 */             return false;
/*  45:    */           }
/*  46: 74 */           if (((i6 == k) || (i6 == m) || (i8 == i3) || (i8 == i4)) && 
/*  47: 75 */             (i7 == 0) && (paramaqu.d(localdt1)) && (paramaqu.d(localdt1.a()))) {
/*  48: 76 */             i5++;
/*  49:    */           }
/*  50:    */         }
/*  51:    */       }
/*  52:    */     }
/*  53: 83 */     if ((i5 < 1) || (i5 > 5)) {
/*  54: 84 */       return false;
/*  55:    */     }
/*  56: 87 */     for (i6 = k; i6 <= m; i6++) {
/*  57: 88 */       for (i7 = 3; i7 >= -1; i7--) {
/*  58: 89 */         for (i8 = i3; i8 <= i4; i8++)
/*  59:    */         {
/*  60: 90 */           localdt1 = paramdt.a(i6, i7, i8);
/*  61: 92 */           if ((i6 == k) || (i7 == -1) || (i8 == i3) || (i6 == m) || (i7 == 4) || (i8 == i4))
/*  62:    */           {
/*  63: 93 */             if ((localdt1.o() >= 0) && (!paramaqu.p(localdt1.b()).c().r().a())) {
/*  64: 94 */               paramaqu.g(localdt1);
/*  65: 95 */             } else if ((paramaqu.p(localdt1).c().r().a()) && 
/*  66: 96 */               (paramaqu.p(localdt1).c() != aty.ae)) {
/*  67: 97 */               if ((i7 == -1) && (paramRandom.nextInt(4) != 0)) {
/*  68: 98 */                 paramaqu.a(localdt1, aty.Y.P(), 2);
/*  69:    */               } else {
/*  70:100 */                 paramaqu.a(localdt1, aty.e.P(), 2);
/*  71:    */               }
/*  72:    */             }
/*  73:    */           }
/*  74:105 */           else if (paramaqu.p(localdt1).c() != aty.ae) {
/*  75:106 */             paramaqu.g(localdt1);
/*  76:    */           }
/*  77:    */         }
/*  78:    */       }
/*  79:    */     }
/*  80:113 */     for (i6 = 0; i6 < 2; i6++) {
/*  81:114 */       for (i7 = 0; i7 < 3; i7++)
/*  82:    */       {
/*  83:115 */         i8 = paramdt.n() + paramRandom.nextInt(j * 2 + 1) - j;
/*  84:116 */         int i9 = paramdt.o();
/*  85:117 */         int i10 = paramdt.p() + paramRandom.nextInt(i2 * 2 + 1) - i2;
/*  86:118 */         dt localdt2 = new dt(i8, i9, i10);
/*  87:120 */         if (paramaqu.d(localdt2))
/*  88:    */         {
/*  89:124 */           int i11 = 0;
/*  90:125 */           for (Object localObject1 = en.a.iterator(); ((Iterator)localObject1).hasNext();)
/*  91:    */           {
/*  92:125 */             localObject2 = (ej)((Iterator)localObject1).next();
/*  93:126 */             if (paramaqu.p(localdt2.a((ej)localObject2)).c().r().a()) {
/*  94:127 */               i11++;
/*  95:    */             }
/*  96:    */           }
/*  97:    */           Object localObject2;
/*  98:131 */           if (i11 == 1)
/*  99:    */           {
/* 100:135 */             paramaqu.a(localdt2, aty.ae.f(paramaqu, localdt2, aty.ae.P()), 2);
/* 101:    */             
/* 102:137 */             localObject1 = vl.a(c, new vl[] { amk.cd.b(paramRandom) });
/* 103:    */             
/* 104:139 */             localObject2 = paramaqu.s(localdt2);
/* 105:140 */             if (!(localObject2 instanceof bcr)) {
/* 106:    */               break;
/* 107:    */             }
/* 108:141 */             vl.a(paramRandom, (List)localObject1, (bcr)localObject2, 8); break;
/* 109:    */           }
/* 110:    */         }
/* 111:    */       }
/* 112:    */     }
/* 113:148 */     paramaqu.a(paramdt, aty.ac.P(), 2);
/* 114:149 */     bcm localbcm = paramaqu.s(paramdt);
/* 115:151 */     if ((localbcm instanceof bdg)) {
/* 116:152 */       ((bdg)localbcm).b().a(a(paramRandom));
/* 117:    */     } else {
/* 118:154 */       a.error("Failed to fetch mob spawner entity at (" + paramdt.n() + ", " + paramdt.o() + ", " + paramdt.p() + ")");
/* 119:    */     }
/* 120:157 */     return true;
/* 121:    */   }
/* 122:    */   
/* 123:    */   private String a(Random paramRandom)
/* 124:    */   {
/* 125:161 */     return b[paramRandom.nextInt(b.length)];
/* 126:    */   }
/* 127:    */ }


/* Location:           C:\Users\Hugo Haldi\Desktop\Decompile Minecraft\1.8.jar
 * Qualified Name:     bie
 * JD-Core Version:    0.7.0.1
 */