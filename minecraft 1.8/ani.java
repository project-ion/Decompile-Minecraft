/*   1:    */ public class ani
/*   2:    */   extends aju
/*   3:    */ {
/*   4:    */   private final awq b;
/*   5:    */   private final awq c;
/*   6:    */   
/*   7:    */   public ani(atr paramatr, awq paramawq1, awq paramawq2)
/*   8:    */   {
/*   9: 17 */     super(paramatr);
/*  10: 18 */     this.b = paramawq1;
/*  11: 19 */     this.c = paramawq2;
/*  12:    */     
/*  13: 21 */     d(0);
/*  14: 22 */     a(true);
/*  15:    */   }
/*  16:    */   
/*  17:    */   public int a(int paramInt)
/*  18:    */   {
/*  19: 27 */     return paramInt;
/*  20:    */   }
/*  21:    */   
/*  22:    */   public String e_(amj paramamj)
/*  23:    */   {
/*  24: 32 */     return this.b.b(paramamj.i());
/*  25:    */   }
/*  26:    */   
/*  27:    */   public boolean a(amj paramamj, ahd paramahd, aqu paramaqu, dt paramdt, ej paramej, float paramFloat1, float paramFloat2, float paramFloat3)
/*  28:    */   {
/*  29: 37 */     if (paramamj.b == 0) {
/*  30: 38 */       return false;
/*  31:    */     }
/*  32: 40 */     if (!paramahd.a(paramdt.a(paramej), paramej, paramamj)) {
/*  33: 41 */       return false;
/*  34:    */     }
/*  35: 44 */     Object localObject = this.b.a(paramamj);
/*  36: 45 */     bec localbec1 = paramaqu.p(paramdt);
/*  37: 47 */     if (localbec1.c() == this.b)
/*  38:    */     {
/*  39: 48 */       bex localbex = this.b.l();
/*  40: 49 */       Comparable localComparable = localbec1.b(localbex);
/*  41: 50 */       awr localawr = (awr)localbec1.b(awq.a);
/*  42: 52 */       if (((paramej == ej.b) && (localawr == awr.b)) || ((paramej == ej.a) && (localawr == awr.a) && (localComparable == localObject)))
/*  43:    */       {
/*  44: 53 */         bec localbec2 = this.c.P().a(localbex, localComparable);
/*  45: 55 */         if ((paramaqu.b(this.c.a(paramaqu, paramdt, localbec2))) && (paramaqu.a(paramdt, localbec2, 3)))
/*  46:    */         {
/*  47: 56 */           paramaqu.a(paramdt.n() + 0.5F, paramdt.o() + 0.5F, paramdt.p() + 0.5F, this.c.H.b(), (this.c.H.d() + 1.0F) / 2.0F, this.c.H.e() * 0.8F);
/*  48: 57 */           paramamj.b -= 1;
/*  49:    */         }
/*  50: 59 */         return true;
/*  51:    */       }
/*  52:    */     }
/*  53: 63 */     if (a(paramamj, paramaqu, paramdt.a(paramej), localObject)) {
/*  54: 64 */       return true;
/*  55:    */     }
/*  56: 67 */     return super.a(paramamj, paramahd, paramaqu, paramdt, paramej, paramFloat1, paramFloat2, paramFloat3);
/*  57:    */   }
/*  58:    */   
/*  59:    */   public boolean a(aqu paramaqu, dt paramdt, ej paramej, ahd paramahd, amj paramamj)
/*  60:    */   {
/*  61: 72 */     dt localdt = paramdt;
/*  62:    */     
/*  63: 74 */     bex localbex = this.b.l();
/*  64: 75 */     Object localObject = this.b.a(paramamj);
/*  65:    */     
/*  66: 77 */     bec localbec1 = paramaqu.p(paramdt);
/*  67: 79 */     if (localbec1.c() == this.b)
/*  68:    */     {
/*  69: 80 */       int i = localbec1.b(awq.a) == awr.a ? 1 : 0;
/*  70: 82 */       if (((paramej == ej.b) && (i == 0)) || ((paramej == ej.a) && (i != 0) && (localObject == localbec1.b(localbex)))) {
/*  71: 83 */         return true;
/*  72:    */       }
/*  73:    */     }
/*  74: 87 */     paramdt = paramdt.a(paramej);
/*  75: 88 */     bec localbec2 = paramaqu.p(paramdt);
/*  76: 89 */     if ((localbec2.c() == this.b) && (localObject == localbec2.b(localbex))) {
/*  77: 90 */       return true;
/*  78:    */     }
/*  79: 93 */     return super.a(paramaqu, localdt, paramej, paramahd, paramamj);
/*  80:    */   }
/*  81:    */   
/*  82:    */   private boolean a(amj paramamj, aqu paramaqu, dt paramdt, Object paramObject)
/*  83:    */   {
/*  84: 97 */     bec localbec1 = paramaqu.p(paramdt);
/*  85: 98 */     if (localbec1.c() == this.b)
/*  86:    */     {
/*  87: 99 */       Comparable localComparable = localbec1.b(this.b.l());
/*  88:101 */       if (localComparable == paramObject)
/*  89:    */       {
/*  90:102 */         bec localbec2 = this.c.P().a(this.b.l(), localComparable);
/*  91:104 */         if ((paramaqu.b(this.c.a(paramaqu, paramdt, localbec2))) && (paramaqu.a(paramdt, localbec2, 3)))
/*  92:    */         {
/*  93:105 */           paramaqu.a(paramdt.n() + 0.5F, paramdt.o() + 0.5F, paramdt.p() + 0.5F, this.c.H.b(), (this.c.H.d() + 1.0F) / 2.0F, this.c.H.e() * 0.8F);
/*  94:106 */           paramamj.b -= 1;
/*  95:    */         }
/*  96:109 */         return true;
/*  97:    */       }
/*  98:    */     }
/*  99:113 */     return false;
/* 100:    */   }
/* 101:    */ }


/* Location:           C:\Users\Hugo Haldi\Desktop\Decompile Minecraft\1.8.jar
 * Qualified Name:     ani
 * JD-Core Version:    0.7.0.1
 */