/*   1:    */ import java.util.Iterator;
/*   2:    */ import java.util.List;
/*   3:    */ import java.util.Set;
/*   4:    */ 
/*   5:    */ public class cy
/*   6:    */   extends z
/*   7:    */ {
/*   8:    */   public String c()
/*   9:    */   {
/*  10: 23 */     return "testforblock";
/*  11:    */   }
/*  12:    */   
/*  13:    */   public int a()
/*  14:    */   {
/*  15: 28 */     return 2;
/*  16:    */   }
/*  17:    */   
/*  18:    */   public String c(ae paramae)
/*  19:    */   {
/*  20: 33 */     return "commands.testforblock.usage";
/*  21:    */   }
/*  22:    */   
/*  23:    */   public void a(ae paramae, String[] paramArrayOfString)
/*  24:    */   {
/*  25: 38 */     if (paramArrayOfString.length < 4) {
/*  26: 39 */       throw new dp("commands.testforblock.usage", new Object[0]);
/*  27:    */     }
/*  28: 41 */     paramae.a(ag.b, 0);
/*  29:    */     
/*  30: 43 */     dt localdt = a(paramae, paramArrayOfString, 0, false);
/*  31: 44 */     atr localatr1 = atr.b(paramArrayOfString[3]);
/*  32: 45 */     if (localatr1 == null) {
/*  33: 46 */       throw new dk("commands.setblock.notFound", new Object[] { paramArrayOfString[3] });
/*  34:    */     }
/*  35: 49 */     int i = -1;
/*  36: 50 */     if (paramArrayOfString.length >= 5) {
/*  37: 51 */       i = a(paramArrayOfString[4], -1, 15);
/*  38:    */     }
/*  39: 54 */     aqu localaqu = paramae.e();
/*  40: 55 */     if (!localaqu.e(localdt)) {
/*  41: 56 */       throw new di("commands.testforblock.outOfWorld", new Object[0]);
/*  42:    */     }
/*  43: 59 */     fn localfn1 = new fn();
/*  44: 60 */     int j = 0;
/*  45: 61 */     if ((paramArrayOfString.length >= 6) && (localatr1.x()))
/*  46:    */     {
/*  47: 62 */       localObject = a(paramae, paramArrayOfString, 5).c();
/*  48:    */       try
/*  49:    */       {
/*  50: 64 */         localfn1 = gg.a((String)localObject);
/*  51: 65 */         j = 1;
/*  52:    */       }
/*  53:    */       catch (gf localgf)
/*  54:    */       {
/*  55: 67 */         throw new di("commands.setblock.tagError", new Object[] { localgf.getMessage() });
/*  56:    */       }
/*  57:    */     }
/*  58: 71 */     Object localObject = localaqu.p(localdt);
/*  59: 72 */     atr localatr2 = ((bec)localObject).c();
/*  60: 73 */     if (localatr2 != localatr1) {
/*  61: 74 */       throw new di("commands.testforblock.failed.tile", new Object[] { Integer.valueOf(localdt.n()), Integer.valueOf(localdt.o()), Integer.valueOf(localdt.p()), localatr2.H(), localatr1.H() });
/*  62:    */     }
/*  63: 77 */     if (i > -1)
/*  64:    */     {
/*  65: 78 */       int k = ((bec)localObject).c().c((bec)localObject);
/*  66: 79 */       if (k != i) {
/*  67: 80 */         throw new di("commands.testforblock.failed.data", new Object[] { Integer.valueOf(localdt.n()), Integer.valueOf(localdt.o()), Integer.valueOf(localdt.p()), Integer.valueOf(k), Integer.valueOf(i) });
/*  68:    */       }
/*  69:    */     }
/*  70: 84 */     if (j != 0)
/*  71:    */     {
/*  72: 85 */       bcm localbcm = localaqu.s(localdt);
/*  73: 86 */       if (localbcm == null) {
/*  74: 87 */         throw new di("commands.testforblock.failed.tileEntity", new Object[] { Integer.valueOf(localdt.n()), Integer.valueOf(localdt.o()), Integer.valueOf(localdt.p()) });
/*  75:    */       }
/*  76: 89 */       fn localfn2 = new fn();
/*  77: 90 */       localbcm.b(localfn2);
/*  78: 92 */       if (!a(localfn1, localfn2, true)) {
/*  79: 93 */         throw new di("commands.testforblock.failed.nbt", new Object[] { Integer.valueOf(localdt.n()), Integer.valueOf(localdt.o()), Integer.valueOf(localdt.p()) });
/*  80:    */       }
/*  81:    */     }
/*  82: 96 */     paramae.a(ag.b, 1);
/*  83: 97 */     a(paramae, this, "commands.testforblock.success", new Object[] { Integer.valueOf(localdt.n()), Integer.valueOf(localdt.o()), Integer.valueOf(localdt.p()) });
/*  84:    */   }
/*  85:    */   
/*  86:    */   public static boolean a(gd paramgd1, gd paramgd2, boolean paramBoolean)
/*  87:    */   {
/*  88:102 */     if (paramgd1 == paramgd2) {
/*  89:103 */       return true;
/*  90:    */     }
/*  91:105 */     if (paramgd1 == null) {
/*  92:106 */       return true;
/*  93:    */     }
/*  94:108 */     if (paramgd2 == null) {
/*  95:109 */       return false;
/*  96:    */     }
/*  97:111 */     if (!paramgd1.getClass().equals(paramgd2.getClass())) {
/*  98:112 */       return false;
/*  99:    */     }
/* 100:    */     Object localObject1;
/* 101:    */     Object localObject2;
/* 102:    */     Object localObject3;
/* 103:115 */     if ((paramgd1 instanceof fn))
/* 104:    */     {
/* 105:116 */       localObject1 = (fn)paramgd1;
/* 106:117 */       localObject2 = (fn)paramgd2;
/* 107:119 */       for (Iterator localIterator = ((fn)localObject1).c().iterator(); localIterator.hasNext();)
/* 108:    */       {
/* 109:119 */         localObject3 = (String)localIterator.next();
/* 110:120 */         gd localgd = ((fn)localObject1).a((String)localObject3);
/* 111:121 */         if (!a(localgd, ((fn)localObject2).a((String)localObject3), paramBoolean)) {
/* 112:122 */           return false;
/* 113:    */         }
/* 114:    */       }
/* 115:126 */       return true;
/* 116:    */     }
/* 117:127 */     if (((paramgd1 instanceof fv)) && (paramBoolean))
/* 118:    */     {
/* 119:128 */       localObject1 = (fv)paramgd1;
/* 120:129 */       localObject2 = (fv)paramgd2;
/* 121:131 */       if (((fv)localObject1).c() == 0) {
/* 122:132 */         return ((fv)localObject2).c() == 0;
/* 123:    */       }
/* 124:135 */       for (int i = 0; i < ((fv)localObject1).c(); i++)
/* 125:    */       {
/* 126:136 */         localObject3 = ((fv)localObject1).g(i);
/* 127:137 */         int j = 0;
/* 128:138 */         for (int k = 0; k < ((fv)localObject2).c(); k++) {
/* 129:139 */           if (a((gd)localObject3, ((fv)localObject2).g(k), paramBoolean))
/* 130:    */           {
/* 131:140 */             j = 1;
/* 132:141 */             break;
/* 133:    */           }
/* 134:    */         }
/* 135:144 */         if (j == 0) {
/* 136:145 */           return false;
/* 137:    */         }
/* 138:    */       }
/* 139:149 */       return true;
/* 140:    */     }
/* 141:151 */     return paramgd1.equals(paramgd2);
/* 142:    */   }
/* 143:    */   
/* 144:    */   public List a(ae paramae, String[] paramArrayOfString, dt paramdt)
/* 145:    */   {
/* 146:158 */     if ((paramArrayOfString.length > 0) && (paramArrayOfString.length <= 3)) {
/* 147:159 */       return a(paramArrayOfString, 0, paramdt);
/* 148:    */     }
/* 149:160 */     if (paramArrayOfString.length == 4) {
/* 150:161 */       return a(paramArrayOfString, atr.c.c());
/* 151:    */     }
/* 152:164 */     return null;
/* 153:    */   }
/* 154:    */ }


/* Location:           C:\Users\Hugo Haldi\Desktop\Decompile Minecraft\1.8.jar
 * Qualified Name:     cy
 * JD-Core Version:    0.7.0.1
 */