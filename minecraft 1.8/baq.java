/*   1:    */ import com.google.common.collect.Lists;
/*   2:    */ import java.util.ArrayList;
/*   3:    */ import java.util.Iterator;
/*   4:    */ import java.util.LinkedList;
/*   5:    */ import java.util.List;
/*   6:    */ import java.util.Queue;
/*   7:    */ import java.util.Random;
/*   8:    */ 
/*   9:    */ public class baq
/*  10:    */   extends atr
/*  11:    */ {
/*  12: 24 */   public static final bet a = bet.a("wet");
/*  13:    */   
/*  14:    */   protected baq()
/*  15:    */   {
/*  16: 33 */     super(bof.m);
/*  17: 34 */     j(this.L.b().a(a, Boolean.valueOf(false)));
/*  18: 35 */     a(akf.b);
/*  19:    */   }
/*  20:    */   
/*  21:    */   public int a(bec parambec)
/*  22:    */   {
/*  23: 40 */     return ((Boolean)parambec.b(a)).booleanValue() ? 1 : 0;
/*  24:    */   }
/*  25:    */   
/*  26:    */   public void c(aqu paramaqu, dt paramdt, bec parambec)
/*  27:    */   {
/*  28: 45 */     e(paramaqu, paramdt, parambec);
/*  29:    */   }
/*  30:    */   
/*  31:    */   public void a(aqu paramaqu, dt paramdt, bec parambec, atr paramatr)
/*  32:    */   {
/*  33: 50 */     e(paramaqu, paramdt, parambec);
/*  34: 51 */     super.a(paramaqu, paramdt, parambec, paramatr);
/*  35:    */   }
/*  36:    */   
/*  37:    */   protected void e(aqu paramaqu, dt paramdt, bec parambec)
/*  38:    */   {
/*  39: 55 */     if ((!((Boolean)parambec.b(a)).booleanValue()) && (d(paramaqu, paramdt)))
/*  40:    */     {
/*  41: 57 */       paramaqu.a(paramdt, parambec.a(a, Boolean.valueOf(true)), 2);
/*  42: 58 */       paramaqu.b(2001, paramdt, atr.a(aty.j));
/*  43:    */     }
/*  44:    */   }
/*  45:    */   
/*  46:    */   private boolean d(aqu paramaqu, dt paramdt)
/*  47:    */   {
/*  48: 63 */     LinkedList localLinkedList = Lists.newLinkedList();
/*  49: 64 */     ArrayList localArrayList = Lists.newArrayList();
/*  50: 65 */     localLinkedList.add(new vi(paramdt, Integer.valueOf(0)));
/*  51:    */     
/*  52: 67 */     int i = 0;
/*  53:    */     dt localdt1;
/*  54: 68 */     while (!localLinkedList.isEmpty())
/*  55:    */     {
/*  56: 69 */       localObject = (vi)localLinkedList.poll();
/*  57: 70 */       localdt1 = (dt)((vi)localObject).a();
/*  58: 71 */       int j = ((Integer)((vi)localObject).b()).intValue();
/*  59: 73 */       for (ej localej : ej.values())
/*  60:    */       {
/*  61: 74 */         dt localdt2 = localdt1.a(localej);
/*  62: 75 */         if (paramaqu.p(localdt2).c().r() == bof.h)
/*  63:    */         {
/*  64: 76 */           paramaqu.a(localdt2, aty.a.P(), 2);
/*  65: 77 */           localArrayList.add(localdt2);
/*  66: 78 */           i++;
/*  67: 79 */           if (j < 6) {
/*  68: 80 */             localLinkedList.add(new vi(localdt2, Integer.valueOf(j + 1)));
/*  69:    */           }
/*  70:    */         }
/*  71:    */       }
/*  72: 84 */       if (i > 64) {
/*  73:    */         break;
/*  74:    */       }
/*  75:    */     }
/*  76: 88 */     for (Object localObject = localArrayList.iterator(); ((Iterator)localObject).hasNext();)
/*  77:    */     {
/*  78: 88 */       localdt1 = (dt)((Iterator)localObject).next();
/*  79: 89 */       paramaqu.c(localdt1, aty.a);
/*  80:    */     }
/*  81: 91 */     return i > 0;
/*  82:    */   }
/*  83:    */   
/*  84:    */   public void a(alq paramalq, akf paramakf, List paramList)
/*  85:    */   {
/*  86: 96 */     paramList.add(new amj(paramalq, 1, 0));
/*  87: 97 */     paramList.add(new amj(paramalq, 1, 1));
/*  88:    */   }
/*  89:    */   
/*  90:    */   public bec a(int paramInt)
/*  91:    */   {
/*  92:102 */     return P().a(a, Boolean.valueOf((paramInt & 0x1) == 1));
/*  93:    */   }
/*  94:    */   
/*  95:    */   public int c(bec parambec)
/*  96:    */   {
/*  97:107 */     return ((Boolean)parambec.b(a)).booleanValue() ? 1 : 0;
/*  98:    */   }
/*  99:    */   
/* 100:    */   protected bed e()
/* 101:    */   {
/* 102:112 */     return new bed(this, new bex[] { a });
/* 103:    */   }
/* 104:    */   
/* 105:    */   public void c(aqu paramaqu, dt paramdt, bec parambec, Random paramRandom)
/* 106:    */   {
/* 107:117 */     if (!((Boolean)parambec.b(a)).booleanValue()) {
/* 108:118 */       return;
/* 109:    */     }
/* 110:121 */     ej localej = ej.a(paramRandom);
/* 111:122 */     if ((localej == ej.b) || (aqu.a(paramaqu, paramdt.a(localej)))) {
/* 112:123 */       return;
/* 113:    */     }
/* 114:126 */     double d1 = paramdt.n();
/* 115:127 */     double d2 = paramdt.o();
/* 116:128 */     double d3 = paramdt.p();
/* 117:132 */     if (localej == ej.a)
/* 118:    */     {
/* 119:133 */       d2 -= 0.05D;
/* 120:134 */       d1 += paramRandom.nextDouble();
/* 121:135 */       d3 += paramRandom.nextDouble();
/* 122:    */     }
/* 123:    */     else
/* 124:    */     {
/* 125:137 */       d2 += paramRandom.nextDouble() * 0.8D;
/* 126:138 */       if (localej.k() == el.a)
/* 127:    */       {
/* 128:139 */         d3 += paramRandom.nextDouble();
/* 129:140 */         if (localej == ej.f) {
/* 130:141 */           d1 += 1.1D;
/* 131:    */         } else {
/* 132:143 */           d1 += 0.05D;
/* 133:    */         }
/* 134:    */       }
/* 135:    */       else
/* 136:    */       {
/* 137:146 */         d1 += paramRandom.nextDouble();
/* 138:147 */         if (localej == ej.d) {
/* 139:148 */           d3 += 1.1D;
/* 140:    */         } else {
/* 141:150 */           d3 += 0.05D;
/* 142:    */         }
/* 143:    */       }
/* 144:    */     }
/* 145:155 */     paramaqu.a(ew.s, d1, d2, d3, 0.0D, 0.0D, 0.0D, new int[0]);
/* 146:    */   }
/* 147:    */ }


/* Location:           C:\Users\Hugo Haldi\Desktop\Decompile Minecraft\1.8.jar
 * Qualified Name:     baq
 * JD-Core Version:    0.7.0.1
 */