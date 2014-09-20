/*   1:    */ import com.google.common.collect.Lists;
/*   2:    */ import java.util.List;
/*   3:    */ 
/*   4:    */ public class bn
/*   5:    */   extends z
/*   6:    */ {
/*   7:    */   public String c()
/*   8:    */   {
/*   9: 29 */     return "fill";
/*  10:    */   }
/*  11:    */   
/*  12:    */   public int a()
/*  13:    */   {
/*  14: 34 */     return 2;
/*  15:    */   }
/*  16:    */   
/*  17:    */   public String c(ae paramae)
/*  18:    */   {
/*  19: 39 */     return "commands.fill.usage";
/*  20:    */   }
/*  21:    */   
/*  22:    */   public void a(ae paramae, String[] paramArrayOfString)
/*  23:    */   {
/*  24: 44 */     if (paramArrayOfString.length < 7) {
/*  25: 45 */       throw new dp("commands.fill.usage", new Object[0]);
/*  26:    */     }
/*  27: 47 */     paramae.a(ag.b, 0);
/*  28:    */     
/*  29: 49 */     dt localdt1 = a(paramae, paramArrayOfString, 0, false);
/*  30: 50 */     dt localdt2 = a(paramae, paramArrayOfString, 3, false);
/*  31: 51 */     atr localatr1 = z.g(paramae, paramArrayOfString[6]);
/*  32:    */     
/*  33: 53 */     int i = 0;
/*  34: 54 */     if (paramArrayOfString.length >= 8) {
/*  35: 55 */       i = a(paramArrayOfString[7], 0, 15);
/*  36:    */     }
/*  37: 58 */     dt localdt3 = new dt(Math.min(localdt1.n(), localdt2.n()), Math.min(localdt1.o(), localdt2.o()), Math.min(localdt1.p(), localdt2.p()));
/*  38: 59 */     dt localdt4 = new dt(Math.max(localdt1.n(), localdt2.n()), Math.max(localdt1.o(), localdt2.o()), Math.max(localdt1.p(), localdt2.p()));
/*  39:    */     
/*  40: 61 */     int j = (localdt4.n() - localdt3.n() + 1) * (localdt4.o() - localdt3.o() + 1) * (localdt4.p() - localdt3.p() + 1);
/*  41: 62 */     if (j > 32768) {
/*  42: 63 */       throw new di("commands.fill.tooManyBlocks", new Object[] { Integer.valueOf(j), Integer.valueOf(32768) });
/*  43:    */     }
/*  44: 66 */     if ((localdt3.o() < 0) || (localdt4.o() >= 256)) {
/*  45: 67 */       throw new di("commands.fill.outOfWorld", new Object[0]);
/*  46:    */     }
/*  47: 70 */     aqu localaqu = paramae.e();
/*  48: 71 */     for (int k = localdt3.p(); k < localdt4.p() + 16; k += 16) {
/*  49: 72 */       for (m = localdt3.n(); m < localdt4.n() + 16; m += 16) {
/*  50: 73 */         if (!localaqu.e(new dt(m, localdt4.o() - localdt3.o(), k))) {
/*  51: 74 */           throw new di("commands.fill.outOfWorld", new Object[0]);
/*  52:    */         }
/*  53:    */       }
/*  54:    */     }
/*  55: 79 */     fn localfn = new fn();
/*  56: 80 */     int m = 0;
/*  57: 81 */     if ((paramArrayOfString.length >= 10) && (localatr1.x()))
/*  58:    */     {
/*  59: 82 */       localObject = a(paramae, paramArrayOfString, 9).c();
/*  60:    */       try
/*  61:    */       {
/*  62: 84 */         localfn = gg.a((String)localObject);
/*  63: 85 */         m = 1;
/*  64:    */       }
/*  65:    */       catch (gf localgf)
/*  66:    */       {
/*  67: 87 */         throw new di("commands.fill.tagError", new Object[] { localgf.getMessage() });
/*  68:    */       }
/*  69:    */     }
/*  70: 91 */     Object localObject = Lists.newArrayList();
/*  71:    */     
/*  72: 93 */     j = 0;
/*  73: 94 */     for (int n = localdt3.p(); n <= localdt4.p(); n++) {
/*  74: 95 */       for (int i1 = localdt3.o(); i1 <= localdt4.o(); i1++) {
/*  75: 96 */         for (int i2 = localdt3.n(); i2 <= localdt4.n(); i2++)
/*  76:    */         {
/*  77: 97 */           dt localdt6 = new dt(i2, i1, n);
/*  78: 99 */           if (paramArrayOfString.length >= 9) {
/*  79:100 */             if ((paramArrayOfString[8].equals("outline")) || (paramArrayOfString[8].equals("hollow")))
/*  80:    */             {
/*  81:101 */               if ((i2 != localdt3.n()) && (i2 != localdt4.n()) && (i1 != localdt3.o()) && (i1 != localdt4.o()) && (n != localdt3.p()) && (n != localdt4.p()))
/*  82:    */               {
/*  83:102 */                 if (!paramArrayOfString[8].equals("hollow")) {
/*  84:    */                   continue;
/*  85:    */                 }
/*  86:103 */                 localaqu.a(localdt6, aty.a.P(), 2);
/*  87:104 */                 ((List)localObject).add(localdt6); continue;
/*  88:    */               }
/*  89:    */             }
/*  90:108 */             else if (paramArrayOfString[8].equals("destroy")) {
/*  91:109 */               localaqu.b(localdt6, true);
/*  92:110 */             } else if (paramArrayOfString[8].equals("keep"))
/*  93:    */             {
/*  94:111 */               if (!localaqu.d(localdt6)) {
/*  95:    */                 continue;
/*  96:    */               }
/*  97:    */             }
/*  98:114 */             else if ((paramArrayOfString[8].equals("replace")) && (!localatr1.x())) {
/*  99:115 */               if (paramArrayOfString.length > 9)
/* 100:    */               {
/* 101:116 */                 atr localatr3 = z.g(paramae, paramArrayOfString[9]);
/* 102:117 */                 if (localaqu.p(localdt6).c() != localatr3) {}
/* 103:    */               }
/* 104:121 */               else if (paramArrayOfString.length > 10)
/* 105:    */               {
/* 106:122 */                 int i3 = z.a(paramArrayOfString[10]);
/* 107:123 */                 localbec = localaqu.p(localdt6);
/* 108:124 */                 if (localbec.c().c(localbec) != i3) {
/* 109:    */                   continue;
/* 110:    */                 }
/* 111:    */               }
/* 112:    */             }
/* 113:    */           }
/* 114:131 */           bcm localbcm1 = localaqu.s(localdt6);
/* 115:132 */           if (localbcm1 != null)
/* 116:    */           {
/* 117:133 */             if ((localbcm1 instanceof vq)) {
/* 118:134 */               ((vq)localbcm1).l();
/* 119:    */             }
/* 120:136 */             localaqu.a(localdt6, aty.cv.P(), localatr1 == aty.cv ? 2 : 4);
/* 121:    */           }
/* 122:139 */           bec localbec = localatr1.a(i);
/* 123:140 */           if (localaqu.a(localdt6, localbec, 2))
/* 124:    */           {
/* 125:143 */             ((List)localObject).add(localdt6);
/* 126:144 */             j++;
/* 127:146 */             if (m != 0)
/* 128:    */             {
/* 129:147 */               bcm localbcm2 = localaqu.s(localdt6);
/* 130:148 */               if (localbcm2 != null)
/* 131:    */               {
/* 132:149 */                 localfn.a("x", localdt6.n());
/* 133:150 */                 localfn.a("y", localdt6.o());
/* 134:151 */                 localfn.a("z", localdt6.p());
/* 135:    */                 
/* 136:153 */                 localbcm2.a(localfn);
/* 137:    */               }
/* 138:    */             }
/* 139:    */           }
/* 140:    */         }
/* 141:    */       }
/* 142:    */     }
/* 143:160 */     for (dt localdt5 : (List)localObject)
/* 144:    */     {
/* 145:161 */       atr localatr2 = localaqu.p(localdt5).c();
/* 146:162 */       localaqu.b(localdt5, localatr2);
/* 147:    */     }
/* 148:165 */     if (j <= 0) {
/* 149:166 */       throw new di("commands.fill.failed", new Object[0]);
/* 150:    */     }
/* 151:168 */     paramae.a(ag.b, j);
/* 152:169 */     a(paramae, this, "commands.fill.success", new Object[] { Integer.valueOf(j) });
/* 153:    */   }
/* 154:    */   
/* 155:    */   public List a(ae paramae, String[] paramArrayOfString, dt paramdt)
/* 156:    */   {
/* 157:175 */     if ((paramArrayOfString.length > 0) && (paramArrayOfString.length <= 3)) {
/* 158:176 */       return a(paramArrayOfString, 0, paramdt);
/* 159:    */     }
/* 160:177 */     if ((paramArrayOfString.length > 3) && (paramArrayOfString.length <= 6)) {
/* 161:178 */       return a(paramArrayOfString, 3, paramdt);
/* 162:    */     }
/* 163:179 */     if (paramArrayOfString.length == 7) {
/* 164:180 */       return a(paramArrayOfString, atr.c.c());
/* 165:    */     }
/* 166:181 */     if (paramArrayOfString.length == 9) {
/* 167:182 */       return a(paramArrayOfString, new String[] { "replace", "destroy", "keep", "hollow", "outline" });
/* 168:    */     }
/* 169:185 */     return null;
/* 170:    */   }
/* 171:    */ }


/* Location:           C:\Users\Hugo Haldi\Desktop\Decompile Minecraft\1.8.jar
 * Qualified Name:     bn
 * JD-Core Version:    0.7.0.1
 */