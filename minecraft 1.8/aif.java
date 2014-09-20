/*   1:    */ import java.util.Random;
/*   2:    */ 
/*   3:    */ class aif
/*   4:    */   extends ajk
/*   5:    */ {
/*   6:    */   aif(aid paramaid, vq paramvq, int paramInt1, int paramInt2, int paramInt3, aqu paramaqu, dt paramdt)
/*   7:    */   {
/*   8: 67 */     super(paramvq, paramInt1, paramInt2, paramInt3);
/*   9:    */   }
/*  10:    */   
/*  11:    */   public boolean a(amj paramamj)
/*  12:    */   {
/*  13: 70 */     return false;
/*  14:    */   }
/*  15:    */   
/*  16:    */   public boolean a(ahd paramahd)
/*  17:    */   {
/*  18: 75 */     return ((paramahd.by.d) || (paramahd.bz >= this.c.a)) && (this.c.a > 0) && (e());
/*  19:    */   }
/*  20:    */   
/*  21:    */   public void a(ahd paramahd, amj paramamj)
/*  22:    */   {
/*  23: 80 */     if (!paramahd.by.d) {
/*  24: 81 */       paramahd.a(-this.c.a);
/*  25:    */     }
/*  26: 83 */     aid.a(this.c).a(0, null);
/*  27: 84 */     if (aid.b(this.c) > 0)
/*  28:    */     {
/*  29: 85 */       localObject = aid.a(this.c).a(1);
/*  30: 86 */       if ((localObject != null) && (((amj)localObject).b > aid.b(this.c)))
/*  31:    */       {
/*  32: 87 */         localObject.b -= aid.b(this.c);
/*  33: 88 */         aid.a(this.c).a(1, (amj)localObject);
/*  34:    */       }
/*  35:    */       else
/*  36:    */       {
/*  37: 90 */         aid.a(this.c).a(1, null);
/*  38:    */       }
/*  39:    */     }
/*  40:    */     else
/*  41:    */     {
/*  42: 93 */       aid.a(this.c).a(1, null);
/*  43:    */     }
/*  44: 95 */     this.c.a = 0;
/*  45:    */     
/*  46: 97 */     Object localObject = this.a.p(this.b);
/*  47: 98 */     if ((!paramahd.by.d) && (!this.a.D) && (((bec)localObject).c() == aty.cf) && (paramahd.bb().nextFloat() < 0.12F))
/*  48:    */     {
/*  49: 99 */       int i = ((Integer)((bec)localObject).b(asz.b)).intValue();
/*  50:100 */       i++;
/*  51:100 */       if (i > 2)
/*  52:    */       {
/*  53:101 */         this.a.g(this.b);
/*  54:102 */         this.a.b(1020, this.b, 0);
/*  55:    */       }
/*  56:    */       else
/*  57:    */       {
/*  58:104 */         this.a.a(this.b, ((bec)localObject).a(asz.b, Integer.valueOf(i)), 2);
/*  59:105 */         this.a.b(1021, this.b, 0);
/*  60:    */       }
/*  61:    */     }
/*  62:107 */     else if (!this.a.D)
/*  63:    */     {
/*  64:108 */       this.a.b(1021, this.b, 0);
/*  65:    */     }
/*  66:    */   }
/*  67:    */ }


/* Location:           C:\Users\Hugo Haldi\Desktop\Decompile Minecraft\1.8.jar
 * Qualified Name:     aif
 * JD-Core Version:    0.7.0.1
 */